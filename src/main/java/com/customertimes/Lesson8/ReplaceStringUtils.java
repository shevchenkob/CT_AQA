package com.customertimes.Lesson8;

import org.apache.commons.lang3.StringUtils;

public class ReplaceStringUtils {

    public static void main(String... args) {
        String input = "IntelliJ IDEA Community IDEA Edition 2021.2";
        String target = "IDEA";
        String replacement = "Java";
        String result1 = StringUtils.replace(input, target, replacement);
        System.out.println(result1);

    }
}