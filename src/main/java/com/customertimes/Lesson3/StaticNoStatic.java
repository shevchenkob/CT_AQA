package com.customertimes.Lesson3;

import com.customertimes.Lesson11.MyLogger;
import com.sun.tools.javac.Main;
import org.apache.log4j.Logger;

import java.lang.reflect.Method;

public class StaticNoStatic {
    private static final Logger LOGGER = Logger.getLogger(MyLogger.class);
     static void staticMethod(){
         LOGGER.info("I am static.");
    }

    public void notStatic(){
        LOGGER.info("I am not static.");
    }

    public static void main(String[] args) {
         staticMethod();
         StaticNoStatic objectForPublic = new StaticNoStatic();
         objectForPublic.notStatic();

        Method[] getAllMeths = StaticNoStatic.class.getMethods();
        for (Method i : getAllMeths) {
            LOGGER.info(i);
        }
    }
}
