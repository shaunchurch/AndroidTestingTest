package com.shaunchurch.mytestedapplication;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestClass {

    public int integer = 1;

    public int doubleInteger() {
        return integer * 2;
    }

    public String matchDate(String string) {
        Pattern pattern = Pattern.compile("\\b(\\d{2}-\\d{2}-\\d{4})");
        Matcher matcher = pattern.matcher(string);
        String date = "";
        while (matcher.find()) {
            date = matcher.group(0);
        }
        return date;
    }
}
