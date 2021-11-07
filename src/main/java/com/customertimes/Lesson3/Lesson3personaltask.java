package com.customertimes.Lesson3;

import com.customertimes.Lesson11.MyLogger;
import org.apache.log4j.Logger;

import java.util.Arrays;

public class Lesson3personaltask {
    private static final Logger LOGGER = Logger.getLogger(MyLogger.class);

    public static void avverageInArray() {
        int[] myArray = {1, 2, 3, 99, 4};
        //Arrays.sort(myArray);

        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] < myArray[j]) {
                    int temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        int firstNum = myArray[0];
        int lastNum = myArray[myArray.length - 1];
        int avgSum = (firstNum + lastNum) / 2;
        LOGGER.info("Average of max and min number: " + avgSum);

    }

    public static void main(String[] args) {
        avverageInArray();
    }
}
