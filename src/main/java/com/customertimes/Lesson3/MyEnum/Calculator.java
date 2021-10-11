package com.customertimes.Lesson3.MyEnum;

public class Calculator {

    public static int calculate
            (EnumCalculator operation, double start, double... number) {
        double result = start;
        for (double digits : number) {
            switch (operation) {
                case PLUSoperation:
                    return (int) (result + digits);
                case MINUSoperation:
                    return (int) (result - digits);
                case TIMESoperation:
                    return (int) (result * digits);
                case DIVISIONoperation:
                    return (int) (result / digits);
                default:
                    System.out.println("Wrong operator.");

            }
        }
        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println(calculate(EnumCalculator.MINUSoperation, 3, 4));
    }
}


