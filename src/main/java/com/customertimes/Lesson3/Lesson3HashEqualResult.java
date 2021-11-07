package com.customertimes.Lesson3;

import com.customertimes.Lesson11.MyLogger;
import org.apache.log4j.Logger;

public class Lesson3HashEqualResult {
    private static final Logger LOGGER = Logger.getLogger(MyLogger.class);


    public static void main(String... args) {

        Lesson3HashEquals value1 = new Lesson3HashEquals("somevalue", "newvalue");
        Lesson3HashEquals value2 = new Lesson3HashEquals("somevalue", "newvalue");

        LOGGER.info("Hashcode of value1: " + value1.hashCode());
        LOGGER.info("Hashcode of value2: " + value2.hashCode());

        LOGGER.info("If hashcode of value1 equal to hashcode value2 "+ value1.equals(value2) );

    }

}
