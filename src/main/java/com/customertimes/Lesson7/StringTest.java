package com.customertimes.Lesson7;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest {
    public static void main(String[] args) {
        //writeFile();
        readFile();

    }

    private static void writeFile() {
        String myText = "Strings, which are widely used in Java programming, are a sequence of characters. In the Java programming language, strings are objects.\n" +
                "The Java platform provides the String class to create and manipulate strings.\n" +
                "In this case, \"Hello world!\" is a string literal—a series of characters in your code that is enclosed in double quotes. Whenever it encounters a string literal in your code, the compiler creates a String object with its value—in this case, Hello world!.\n" +
                "As with any other object, you can create String objects by using the new keyword and a constructor. The String class has thirteen constructors that allow you to provide the initial value of the string using different sources, such as an array of characters:\n";
        File file = new File("lesson7.doc");
        try {
            FileUtils.writeStringToFile(file, myText, Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile() {
        File file = new File("lesson7.doc");

        try {
            String fileContent = FileUtils.readFileToString(file, Charset.defaultCharset());
            System.out.println(fileContent);

            String[] paragraphs = fileContent.split("\\n");
            System.out.println("Number of paragraphs: " + paragraphs.length);

            String[] words = fileContent.split("\\s+");
            System.out.println("Number of words: " + words.length);

            String[] sentences = fileContent.split("[?.]+");
            System.out.println("Number of sentences: " + sentences.length);

            int count = 0;
            for (int i = 0; i < fileContent.length(); i++) {
                if (Character.isLetter(fileContent.charAt(i)))
                    count++;
            }
            System.out.println("Number of characters: " + count);

            String[] wordsInParagraph1 = paragraphs[0].split("\\s+");
            System.out.println("Number of wordsInParagraph1: " + wordsInParagraph1.length);

            String[] wordsInParagraph2 = paragraphs[1].split("\\s+");
            System.out.println("Number of wordsInParagraph1: " + wordsInParagraph2.length);

            String[] wordsInParagraph3 = paragraphs[2].split("\\s+");
            System.out.println("Number of wordsInParagraph1: " + wordsInParagraph3.length);

            String[] wordsInParagraph4 = paragraphs[3].split("\\s+");
            System.out.println("Number of wordsInParagraph1: " + wordsInParagraph4.length);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
