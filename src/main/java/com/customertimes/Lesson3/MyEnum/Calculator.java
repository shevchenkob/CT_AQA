package com.customertimes.Lesson3.MyEnum;

import com.customertimes.Lesson11.MyLogger;
import org.apache.log4j.Logger;

public class Calculator {
    private static final Logger LOGGER = Logger.getLogger(MyLogger.class);


    public static void main(String[] args) {
        LOGGER.info(calculate(EnumCalculator.DIVISION, 3, 1, 5));
    }

    private static double calculate (EnumCalculator operation, int... i) {
        double j = i[0];
        for (int k=1; k<i.length; k++) {
            switch (operation) {
                case PLUS:
                     j += i[k];
                     break;
                case MINUS:
                    j -= i[k];
                    break;
                case TIMES:
                    j *= i[k];
                    break;
                case DIVISION:
                    if (j == 0){
                        LOGGER.info("It is protected to division by 0.");
                        break;
                    } else {
                        j /= i[k];

                    }
            }
        }
        return j;
    }
}


