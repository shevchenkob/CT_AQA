package com.customertimes.Lesson3.MyEnum;

public class Calculator {

    public static double calculate
            (EnumCalculator operation, double i, double... number) {
        for (double digits : number) {
            switch (operation) {
                case PLUSoperation:
                    return (i + digits);
                case MINUSoperation:
                    return (i - digits);
                case TIMESoperation:
                    return (i * digits);
                case DIVISIONoperation:
                    return (i / digits);
                default:
                    System.out.println("Wrong operator.");

            }
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(calculate(EnumCalculator.DIVISIONoperation, 3, 4, 5));
    }
}


