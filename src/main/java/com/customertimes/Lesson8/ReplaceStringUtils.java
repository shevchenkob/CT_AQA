package com.customertimes.Lesson8;

import org.apache.commons.lang3.StringUtils;

public class ReplaceStringUtils {

    public static void main(String... args) {
        String input = "IntelliJ IDEA Community IDEA Edition 2021.2";
        String target = "IDEA";
        String replacement = "Java";
        String result1 = StringUtils.replace(input, target, replacement);
        System.out.println(result1);

        String result2 = StringUtils.replaceEach(input, new String[]{"IntelliJ", "Community", "Edition"}, new String[]{"newIntelliJ", "newCommunity", "newEdition"});
        System.out.println(result2);

        String result3 = StringUtils.replaceChars(input, "I", "8");
        System.out.println(result3);

        String result4 = input.replaceAll("[ .]", "_");
        System.out.println(result4);
    }
}