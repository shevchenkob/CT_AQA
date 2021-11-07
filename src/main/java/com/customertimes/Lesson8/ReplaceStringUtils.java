package com.customertimes.Lesson8;

import com.customertimes.Lesson11.MyLogger;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

public class ReplaceStringUtils {
    private static final Logger LOGGER = Logger.getLogger(MyLogger.class);

    public static void main(String... args) {
        String input = "IntelliJ IDEA Community IDEA Edition 2021.2";
        String target = "IDEA";
        String replacement = "Java";
        String result1 = StringUtils.replace(input, target, replacement);
        LOGGER.info(result1);

        String result2 = StringUtils.replaceEach(input, new String[]{"IntelliJ", "Community", "Edition"}, new String[]{"newIntelliJ", "newCommunity", "newEdition"});
        LOGGER.info(result2);

        String result3 = StringUtils.replaceChars(input, "I", "8");
        LOGGER.info(result3);

        String result4 = input.replaceAll("[ .]", "_");
        LOGGER.info(result4);
    }
}