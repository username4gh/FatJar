package com.kyokose.test;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApkToolLatestUrl {
    private static String extract(String input) {

        String patternStr = "(?<=href\\=\").*?(?=\"\\>apktool.*$)";
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return matcher.group();
        }

        return null;
    }

    public static void main(String[] args) {
        Connection connection = Jsoup.connect("https://bitbucket.org/iBotPeaches/apktool/downloads");
        try {
            Document document = connection.get();
            Elements elements = document.getElementsByClass("execute");
            for (Element element : elements) {
                String result = extract(element.toString());
                if (result != null && result.length() > 0) {
                    System.out.println("https://bitbucket.org" + result);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
