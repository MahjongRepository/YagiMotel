package org.yagi.motel.bot.telegram;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.pekko.actor.ActorRef;
import org.telegram.telegrambots.client.okhttp.OkHttpTelegramClient;
import org.telegram.telegrambots.longpolling.util.LongPollingSingleThreadUpdateConsumer;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.TelegramClient;
import org.yagi.motel.config.AppConfig;
import org.yagi.motel.handler.*;
import org.yagi.motel.handler.context.CommandContext;
import org.yagi.motel.handler.context.HandlerErrorContext;
import org.yagi.motel.handler.holder.PlatformCallbacksHolder;
import org.yagi.motel.kernel.enums.PlatformType;
import org.yagi.motel.kernel.model.container.ResultCommandContainer;
import org.yagi.motel.kernel.model.enums.IsProcessedState;
import org.yagi.motel.kernel.model.enums.Lang;
import org.yagi.motel.kernel.repository.StateRepository;

import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.function.Function;
import java.util.function.Supplier;

import static org.yagi.motel.bot.telegram.utils.TelegramCommandPermissionsProvider.*;

@Slf4j
@SuppressWarnings("checkstyle:MissingJavadocType")
public class TgTournamentHelper implements LongPollingSingleThreadUpdateConsumer, Runnable {
    private static final String WHITESPACE_STR = " ";
    private static final Integer COMMAND_UNIQUE_ID_LENGTH = 10;
    private final Map<String, CommandHandler> handlers;
    private final AppConfig config;
    private final StateRepository stateRepository;
    private final BlockingQueue<ResultCommandContainer> messagesQueue;
    private final TelegramClient telegramClient;

    @SuppressWarnings("checkstyle:MissingJavadocMethod")
    public TgTournamentHelper(
            ActorRef commandDispatcherActor,
            ActorRef errorCommandDispatcherActor,
            AppConfig config,
            StateRepository stateRepository,
            BlockingQueue<ResultCommandContainer> messagesQueue) {
        this.config = config;
        this.stateRepository = stateRepository;
        this.messagesQueue = messagesQueue;
        this.telegramClient = new OkHttpTelegramClient(config.getTelegram().getTgBotToken());
        final List<Object> args = new ArrayList<>();
        args.add(config);
        args.add(commandDispatcherActor);
        args.add(errorCommandDispatcherActor);
        args.add(registerCallbacks());

        this.handlers = registerHandlers(args, config);
    }

    @Override
    public void consume(Update update) {
        if (update.hasMessage()
                && update.getMessage().hasText()
                && update.getMessage().getChatId() != null) {
            final Long chatId = update.getMessage().getChatId();
            if (update.getMessage().getFrom() == null) {
                sendMessage("Вы что-то делаете не так. Обратитесь к администратору.", chatId, false);
            }
            final Optional<String> username = extractUsername(update);
            Optional<IsProcessedState> isProcessedState = stateRepository.getIsProcessedState();
            if (chatId.equals(config.getTelegram().getTgAdminChatId())
                    || (isProcessedState.isPresent() && IsProcessedState.ENABLE == isProcessedState.get())) {
                String inputText =
                        StringUtils.normalizeSpace(update.getMessage().getText());
                String[] commandArgs = inputText.split(WHITESPACE_STR);
                if (commandArgs.length >= 1) {
                    String commandPrefix = StringUtils.normalizeSpace(commandArgs[0]);
                    if (handlers.containsKey(commandPrefix)) {
                        handlers.get(commandPrefix)
                                .handleCommand(CommandContext.builder()
                                        .commandUniqueId(
                                                Long.valueOf(RandomStringUtils.randomNumeric(COMMAND_UNIQUE_ID_LENGTH)))
                                        .commandArgs(commandArgs)
                                        .senderChatId(chatId)
                                        .username((username != null && username.isPresent()) ? username.get() : null)
                                        .platformType(PlatformType.TG)
                                        .requestedResponseLang(Lang.RU.getLang())
                                        .build());
                    }
                }
            }
        }
    }

    private PlatformCallbacksHolder registerCallbacks() {
        return PlatformCallbacksHolder.builder()
                .platformErrorMessageSupplier(prepareErrorMessageSupplier())
                .platformAdminChatIdSupplier(prepareGetAdminChatIdSupplier())
                .build();
    }

    private Map<String, CommandHandler> registerHandlers(final List<Object> args, AppConfig config) {
        final Map<String, CommandHandler> handlers = new HashMap<>();
        handlers.putIfAbsent(
                "/log", registerCommandHandler(LogCommandHandler.class, getHandlerArgs(args, new HashSet<>())));
        handlers.putIfAbsent(
                "/start_serve",
                registerCommandHandler(
                        StartServeCommandHandler.class, getHandlerArgs(args, getStartServeCommandPermissions(config))));
        handlers.putIfAbsent(
                "/stop_serve",
                registerCommandHandler(
                        StopServeCommandHandler.class, getHandlerArgs(args, getStopServeCommandPermissions(config))));
        handlers.putIfAbsent(
                "/start_registration",
                registerCommandHandler(
                        StartRegistrationCommandHandler.class,
                        getHandlerArgs(args, getStartRegistrationCommandPermissions(config))));
        handlers.putIfAbsent(
                "/close_registration",
                registerCommandHandler(
                        CloseRegistrationCommandHandler.class,
                        getHandlerArgs(args, getCloseRegistrationCommandPermissions(config))));
        handlers.putIfAbsent(
                "/me",
                registerCommandHandler(MeCommandHandler.class, getHandlerArgs(args, getMeCommandPermissions(config))));
        handlers.putIfAbsent(
                "/add",
                registerCommandHandler(
                        AddCommandHandler.class, getHandlerArgs(args, getAddCommandPermissions(config))));
        handlers.putIfAbsent(
                "/status", registerCommandHandler(StatusCommandHandler.class, getHandlerArgs(args, new HashSet<>())));
        handlers.putIfAbsent(
                "/update_teams",
                registerCommandHandler(
                        UpdateTeamsCommandHandler.class,
                        getHandlerArgs(args, getUpdateTeamsCommandPermissions(config))));
        handlers.putIfAbsent(
                "/add_penalty_game",
                registerCommandHandler(
                        AddPenaltyGameCommandHandler.class,
                        getHandlerArgs(args, getAddPenaltyGameCommandPermissions(config))));
        return Collections.unmodifiableMap(handlers);
    }

    private Object[] getHandlerArgs(final List<Object> args, final Set<Long> allowedChatIds) {
        List<Object> currentArgs = new ArrayList<>(args);
        currentArgs.add(allowedChatIds);
        return currentArgs.toArray();
    }

    private Supplier<Long> prepareGetAdminChatIdSupplier() {
        return () -> config.getTelegram().getTgAdminChatId();
    }

    @SuppressWarnings("checkstyle:LineLength")
    private Function<HandlerErrorContext, Optional<String>> prepareErrorMessageSupplier() {
        return handlerErrorContext -> {
            switch (handlerErrorContext.getErrorType()) {
                case COMMAND_NOT_ALLOWED:
                    return Optional.of(String.format(
                            "@%s эта команда недоступна",
                            handlerErrorContext.getContext().getUsername()));
                case MISSED_USERNAME:
                    return Optional.of("Нужно прописать username в настройках telegram!");
                case MISSED_PLATFORM_USERNAME:
                    return Optional.of(String.format(
                            "Перед привязкой %s ника нужно установить username в настройках "
                                    + "телеграма. Инструкция: http://telegramzy.ru/nik-v-telegramm/",
                            "mahjongsoul или tenhou.net"));
                case GAME_PLATFORM_INCORRECT:
                    return Optional.of("Game platform incorrect!");
                case MISSED_CONFIRM_CODE:
                    return Optional.of("Confirm code is missed!");
                default:
                    break;
            }
            return Optional.empty();
        };
    }

    private CommandHandler registerCommandHandler(Class<? extends CommandHandler> handlerClazz, Object[] args) {
        try {
            return handlerClazz
                    .getDeclaredConstructor(
                            AppConfig.class, ActorRef.class, ActorRef.class, PlatformCallbacksHolder.class, Set.class)
                    .newInstance(args);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    private Optional<String> extractUsername(Update update) {
        User from = update.getMessage().getFrom();
        if (Boolean.FALSE.equals(from.getIsBot())) {
            return Optional.ofNullable(from.getUserName());
        }
        return Optional.empty();
    }

    @SuppressWarnings("checkstyle:MissingJavadocMethod")
    private void sendMessage(String message, Long chatId, boolean withMarkdown) {
        try {
            SendMessage sendMessage = new SendMessage(chatId.toString(), message);
            if (withMarkdown) {
                sendMessage.enableMarkdown(true);
            }
            execute(sendMessage);
        } catch (Exception ex) {
            // todo handle
            log.error("error while execute", ex);
            throw new RuntimeException(ex);
        }
    }

    private void execute(SendMessage sendMessage) throws TelegramApiException {
        telegramClient.execute(sendMessage);
    }

    @Override
    public void run() {
        do {
            try {
                ResultCommandContainer resultCommandContainer = messagesQueue.take();
                switch (resultCommandContainer.getPlatformType()) {
                    case TG:
                        sendMessage(
                                resultCommandContainer.getResultMessage(),
                                resultCommandContainer.getReplyChatId(),
                                resultCommandContainer.getCommandType() == null);
                        break;
                    default:
                        break;
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        } while (!Thread.interrupted());
    }
}
