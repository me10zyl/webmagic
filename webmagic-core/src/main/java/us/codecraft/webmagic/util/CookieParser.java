package us.codecraft.webmagic.util;

import java.util.List;
import java.util.stream.Collectors;

public class CookieParser {

    public static String parseCookie(String setCookie){
        return setCookie.split(";")[0];
    }

    public static List<String> parseCookies(List<String> setCookies){
        return setCookies.stream().map(CookieParser::parseCookie).collect(Collectors.toList());
    }

}
