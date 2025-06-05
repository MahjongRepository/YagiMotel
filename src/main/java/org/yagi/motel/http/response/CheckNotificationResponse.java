package org.yagi.motel.http.response;

import lombok.Data;

import java.util.List;

@Data
@SuppressWarnings("checkstyle:MissingJavadocType")
public class CheckNotificationResponse {
    private List<Notification> notifications;
}
