package com.customertimes.Lesson1;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Lesson1 {


    public static void wrapperInt () {
        int inputInteger = 10;

        /*
        In this method we add wrapper to integer data type and comparing input value with 11 number.
        */
        int transformInt = Integer.compare(inputInteger, 11);
        System.out.println(transformInt);

        /*
        In this method we add wrapper to integer data type and sum provided and having integers.
        */
        int transformInt2 = Integer.sum(5, inputInteger);
        System.out.println(transformInt2);

        /*
        In this method we add wrapper to integer data type and comparing it to provided number.
        */
        int transformInt3 = Integer.max(inputInteger, 11);
        System.out.println(transformInt3);
    }


    public static void wrapperChar () {
        char inputChar = 'l';
        /*
        In this method we add wrapper to char and changing input value to uppercase.
        */
        char transformChar = Character.toUpperCase(inputChar);
        System.out.println(transformChar);

        /*
        In this method we add wrapper to char and checking if provided char space.
        */
        boolean transformChar2 = Character.isSpaceChar(inputChar);
        System.out.println(transformChar2);

    }


    public static void wrapperShort () {
        short inputShort = 12354;

        /*
        In method below we add wrapper to short data type and getting 3-rd char after transforming to string type.
        */
        char transformedShort = Short.toString(inputShort).charAt(2);
        System.out.println(transformedShort);

    }

    public static void wrapperLong () {
        long inputLong = 1236534665;

        /*
        In this method we add wrapper to long data type and replaising digit 3 to "a" symbol after converting to string.
        */
        String transformLong = Long.toString(inputLong).replace('3', 'a');
        System.out.println(transformLong);

    }


    public static void wrapperByte () {
        byte inputByte = 21;

        /*
        In this method we add wrapper to byte data type and after converting to string get first position of digit.
        */
        String transformByte = Byte.toString(inputByte);
        System.out.println(transformByte.charAt(0));
    }

    /*
    In this method we add wrapper to boolean data type and applying logicalOr methot that return true if either of the bool value is true.
    */
    public static void wrapperBoolean () {
        boolean inputBoolean = true;
       boolean transformBoolean = Boolean.logicalOr(inputBoolean, false);
        System.out.println(transformBoolean);
    }

    /*
    In this method we add wrapper to double data type and comparing two values with each other.
    */
    public static void wrapperDouble () {
        double inputDouble = 33.3;
        int transformDouble = Double.compare(inputDouble, 3.33);
        System.out.println(transformDouble);

    }

    /*
    In this method we add wrapper to float data type and check if the argument passed is infinitely large in magnitude.
    */
    public static void wrapperFloat () {
        float inputFloat = 51;
       boolean transformFloat = Float.isInfinite(inputFloat);
        System.out.println("Infinity value for isInfinite() method is: " + transformFloat);
    }

    public static void simpleArray () {
        String[] newArray = {"1", "2", "3"};

        // checking if digit 4 present in array
        boolean ifPresent4 = Arrays.asList(newArray).contains("4");
        System.out.println(ifPresent4);

        // Create an ArrayList from an array
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(newArray));
        System.out.println(arrayList);

        //Convert an array to a set
        Set<String> set = new HashSet<>(Arrays.asList(newArray));
        System.out.println(set);

    }




    public static void twoDimArray () {
        int[][] arrayOne = new int[3][3];
        arrayOne[0][0] = 1;
        arrayOne[0][1] = 2;
        arrayOne[1][0] = 3;
        arrayOne[1][1] = 4;
        arrayOne[2][0] = 5;
        arrayOne[2][1] = 6;
        arrayOne[0][2] = 7;
        arrayOne[1][2] = 8;
        arrayOne[2][2] = 9;

        int[][] oneMoreArray = {{1,2,3}, {4, 5,6}, {7, 8, 9}};
        System.out.println("On position [1][1] = " + oneMoreArray[1][1]);



    }


    public static void main(String[] args) {
        simpleArray();
    }

}
