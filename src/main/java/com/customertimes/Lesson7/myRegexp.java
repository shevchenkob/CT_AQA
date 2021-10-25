package com.customertimes.Lesson7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class myRegexp {
    public static void main(String[] args) {
        regExpression1();

    }

    private static void regExpression1() {
        Pattern pattern = Pattern.compile("^User (Anatolii98|Sergei) updated the page at \\d{1,2}:\\d{2} (?:am|pm), (\\d{1,3}|1000) days ago$");
        Matcher matcher = pattern.matcher("User Anatolii98 updated the page at 11:11 am, 1000 days ago");
        boolean isFound = matcher.find();
        String result = isFound ? "Match found" : "Match not found";
        System.out.println(result);
    }
}
