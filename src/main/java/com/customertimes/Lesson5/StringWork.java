package com.customertimes.Lesson5;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class StringWork {

    String mySubstring = "this text cropped";

    public static void main(String[] args) {

        String mySubstring = "this text cropped";

        /* Task10 */
        String toOneText = "In this case, \"Hello world!\\/\\\\\" is a string literal—a series of characters in your code that is enclosed in double quotes. Whenever it encounters a string literal in your code, the compiler creates a String object with its value—in this case, Hello world\\.\n As with any\\other object, you can create String objects by using the new keyword and a constructor. The String class has thirteen constructors that allow you to provide the initial value of the string using different sources, such as an array of characters\n";

        System.out.println(toOneText);
        System.out.println(mySubstring.substring(5, 9));

        boolean myContains = mySubstring.contains("text");
        System.out.println("String contains 'text' :" + myContains);

        String myReplace = mySubstring.replace("text", "word");
        System.out.println(myReplace);

        String[] mySplit = mySubstring.split(" ");
        /* To show every word from new row. */
        for (String splitNewRow : mySplit) {
            System.out.println(splitNewRow);
        }

        System.out.println(Arrays.toString(mySplit));
    }
}
