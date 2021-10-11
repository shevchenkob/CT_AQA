package com.customertimes.Lesson3.MyEnum;

public class Calculator {

    public static double calculate
            (EnumCalculator operation, double i, double... j) {
        for (double digits : j) {
            switch (operation) {
                case PLUSoperation:
                    return (i + digits);
                case MINUSoperation:
                    return (i - digits);
                case TIMESoperation:
                    return (i * digits);
                case DIVISIONoperation:
                    return (i / digits);

            }
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(calculate(EnumCalculator.DIVISIONoperation, 3, 4, 5));
    }
}


