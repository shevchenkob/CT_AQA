package com.customertimes.Lesson5;

import com.customertimes.Lesson11.MyLogger;
import org.apache.log4j.Logger;

import java.sql.SQLOutput;
import java.util.Arrays;

public class StringWork {
    private static final Logger LOGGER = Logger.getLogger(MyLogger.class);

    String mySubstring = "this text cropped";

    public static void main(String[] args) {

        String mySubstring = "this text cropped";

        /* Task10 */
        String toOneText = "In this case, \"Hello world!\\/\\\\\" is a string literal—a series of characters in your code that is enclosed in double quotes. Whenever it encounters a string literal in your code, the compiler creates a String object with its value—in this case, Hello world\\.\n As with any\\other object, you can create String objects by using the new keyword and a constructor. The String class has thirteen constructors that allow you to provide the initial value of the string using different sources, such as an array of characters\n";

        LOGGER.info(toOneText);
        LOGGER.info(mySubstring.substring(5, 9));

        boolean myContains = mySubstring.contains("text");
        LOGGER.info("String contains 'text' :" + myContains);

        String myReplace = mySubstring.replace("text", "word");
        LOGGER.info(myReplace);

        String[] mySplit = mySubstring.split(" ");
        /* To show every word from new row. */
        for (String splitNewRow : mySplit) {
            LOGGER.info(splitNewRow);
        }

        LOGGER.info(Arrays.toString(mySplit));

        /* Stringbuffer */
        long startAction = System.currentTimeMillis();
        StringBuffer myStrBuff = new StringBuffer("Text to make action ");
        for (int i = 0; i < 1000; i++) {
            myStrBuff.append("plus this text");
        }
        LOGGER.info("Time to stringbuffer: " + (System.currentTimeMillis() - startAction));

        long newStartAction = System.currentTimeMillis();
        StringBuilder myStringBuil = new StringBuilder("New text to make action ");
        for (int i = 0; i < 1000; i++) {
            myStringBuil.append("plus this new text");
        }
        LOGGER.info("Time to stringbuilder: " + (System.currentTimeMillis() - startAction));

    }
}
