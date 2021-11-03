package com.customertimes.Lesson3;

public class Recursion {
    public static int recurs(int i){
        if (i > 10) {
            return recurs(i++);
        }
        return i;
    }

    static int factorial( int n ) {
        if (n != 0)  // termination condition
            return n * factorial(n-1); // recursive call
        else
            return 1;
    }

    public static void main(String[] args) {
        System.out.println(recurs(5));
        System.out.println(factorial(4));
    }
}
