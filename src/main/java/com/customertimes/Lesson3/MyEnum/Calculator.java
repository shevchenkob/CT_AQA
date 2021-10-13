package com.customertimes.Lesson3.MyEnum;

public class Calculator {

    public static void main(String[] args) {
        System.out.println(calculate(EnumCalculator.PLUS, 3, 0, 5));
    }

    public static double calculate
            (EnumCalculator operation, int i, int[] j) {
        for (double digits : j) {
            switch (operation) {
                case PLUS:
                    return (i + digits);
                case MINUS:
                    return (i - digits);
                case TIMES:
                    return (i * digits);
                case DIVISION:
                    if (digits == 0){
                        System.out.println("It is protected to division by 0.");
                        break;
                    } else {
                        return (i / digits);
                    }

            }
        }
        return i;
    }
}


