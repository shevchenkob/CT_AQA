package com.customertimes.Lesson3.MyEnum;

public class Calculator {

    public static void main(String[] args) {
        System.out.println(calculate(EnumCalculator.PLUS, 3, 1, 5));
    }

    public static double calculate (EnumCalculator operation, int... i) {
        int j = i[0];
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
                        System.out.println("It is protected to division by 0.");
                        break;
                    } else {
                        j /= i[k];

                    }
            }
        }
        return j;
    }
}


