package com.customertimes.Lesson3;

import com.customertimes.Lesson11.MyLogger;
import org.apache.log4j.Logger;

public class Recursion {
    private static final Logger LOGGER = Logger.getLogger(MyLogger.class);
    public static int recurs(int i){
        if (i > 10) {
            return recurs(i++);
        }
        return i;
    }

    static int factorial( int n ) {
        if (n != 0)  // termination condition
            return n * factorial(n-1); // recursive call
        else
            return 1;
    }

    public static void main(String[] args) {
        LOGGER.info(recurs(5));
        LOGGER.info(factorial(4));
    }
}
