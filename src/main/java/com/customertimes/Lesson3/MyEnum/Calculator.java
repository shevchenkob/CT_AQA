package com.customertimes.Lesson3.MyEnum;

public class Calculator {

    public static int calculate
            (EnumCalculator operation, double i, double... number) {
        for (double digits : number) {
            switch (operation) {
                case PLUSoperation:
                    return (int) (i + digits);
                case MINUSoperation:
                    return (int) (i - digits);
                case TIMESoperation:
                    return (int) (i * digits);
                case DIVISIONoperation:
                    return (int) (i / digits);
                default:
                    System.out.println("Wrong operator.");

            }
        }
        return (int) i;
    }

    public static void main(String[] args) {
        System.out.println(calculate(EnumCalculator.PLUSoperation, 3, 4, 5));
    }
}


