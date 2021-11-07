package com.customertimes.Lesson7;

import com.customertimes.Lesson11.MyLogger;
import org.apache.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class myRegexp {
    private static final Logger LOGGER = Logger.getLogger(MyLogger.class);
    public static void main(String[] args) {
        regExpression1();

    }

    private static void regExpression1() {
        Pattern pattern = Pattern.compile("^User (Anatolii98|Sergei) updated the page at \\d{1,2}:\\d{2} (am|pm), (?!0)(\\d{1,3}|1000) days ago$");
        Matcher matcher = pattern.matcher("User Anatolii98 updated the page at 11:11 am, 1 days ago");
        boolean isFound = matcher.find();
        String result = isFound ? "Match found" : "Match not found";
        LOGGER.info(result);
    }
}
