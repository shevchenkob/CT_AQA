package com.customertimes.Lesson7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class myRegexp {
    public static void main(String[] args) {
        regExpression1();

    }

    private static void regExpression1() {
        Pattern pattern = Pattern.compile("^[User ][Anatolii98|Sergeid][updated the page at ][0-9]{1-2}[:][0-9]{2}[,][0-9]{1-4}[am|pm][ days ago]");
        Matcher matcher = pattern.matcher("User Anatolii98 updated the page at 11:11, 5 days ago");
        boolean isFound = matcher.find();
        String result = isFound ? "Match found" : "Match not found";
        System.out.println(result);
    }
}
