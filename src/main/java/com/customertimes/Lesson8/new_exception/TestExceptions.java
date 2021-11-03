package com.customertimes.Lesson8.new_exception;

public class TestExceptions {

    public static void main(String... args) {
        int myDigit = 5;
        int[] myArr = {1, 2, 3};

            try {
                int myNull = 0;
                int a = 5 / myNull;
            } catch (ArithmeticException e) {
                System.out.println ("You Shouldn't divide a number by zero");

            } finally {
                System.out.println("This text always shown after first exception"); }

            try {
                int a[]=new int[10];
                a[11] = 9;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println ("ArrayIndexOutOfBounds");
            } finally {
                System.out.println("This text always shown after second exception"); }

            try {
                String str=null;
                System.out.println (str.length());
            } catch (NullPointerException e) {
                System.out.println("Null Pointer Exception");
            } finally {
                System.out.println("This text always shown after third exception"); }



        }

    }

