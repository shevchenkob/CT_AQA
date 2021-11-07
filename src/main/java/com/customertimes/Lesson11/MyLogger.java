package com.customertimes.Lesson11;


import org.apache.log4j.Logger;

public class MyLogger {
    private static final Logger LOGGER = Logger.getLogger(MyLogger.class);

    public static void main (String... args) {
        LOGGER.info("output");
    }
}
