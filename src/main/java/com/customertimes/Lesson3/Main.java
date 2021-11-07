package com.customertimes.Lesson3;

import com.customertimes.Lesson11.MyLogger;
import org.apache.log4j.Logger;

// Create a class attribute
public class Main {
    private static final Logger LOGGER = Logger.getLogger(MyLogger.class);
    int someObject;
    char someChar;
    String someString;
    boolean someBoolean;

    public Main(int one, char two, String four, boolean five ) {
        // Set the initial value for the class attribute someObject
        someObject = one;
        someChar = two;
        someString = four;
        someBoolean = five;
    }

    public static void main(String[] args) {
        // Create an object of class Main (This will call the constructor)
        Main myObj = new Main(1, 's', "some text", true);
        LOGGER.info("Values of my params: " + myObj.someObject + ", " + myObj.someChar+", "+myObj.someString+", "+myObj.someBoolean);

    }
}
