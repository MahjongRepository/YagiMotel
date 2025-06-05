package org.yagi.motel.utils;

import lombok.experimental.UtilityClass;

import java.net.URI;
import java.net.URISyntaxException;

@UtilityClass
@SuppressWarnings("checkstyle:MissingJavadocType")
public class UrlHelper {
    @SuppressWarnings("checkstyle:MissingJavadocMethod")
    public static String normalizeUrl(String url) {
        try {
            return new URI(url).normalize().toString();
        } catch (URISyntaxException e) {
            return url;
        }
    }
}
