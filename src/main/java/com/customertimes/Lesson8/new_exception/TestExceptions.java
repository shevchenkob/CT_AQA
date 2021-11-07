package com.customertimes.Lesson8.new_exception;

import com.customertimes.Lesson11.MyLogger;
import org.apache.log4j.Logger;

public class TestExceptions {
    private static final Logger LOGGER = Logger.getLogger(MyLogger.class);
    public static void main(String... args) {
        int myDigit = 5;
        int[] myArr = {1, 2, 3};

            try {
                int myNull = 0;
                int a = 5 / myNull;
            } catch (ArithmeticException e) {
                LOGGER.info("You Shouldn't divide a number by zero");

            } finally {
                LOGGER.info("This text always shown after first exception"); }

            try {
                int a[]=new int[10];
                a[11] = 9;
            }
            catch(ArrayIndexOutOfBoundsException e){
                LOGGER.info("ArrayIndexOutOfBounds");
            } finally {
                LOGGER.info("This text always shown after second exception"); }

            try {
                String str=null;
                LOGGER.info(str.length());
            } catch (NullPointerException e) {
                LOGGER.info("Null Pointer Exception");
            } finally {
                LOGGER.info("This text always shown after third exception"); }



        }

    }

