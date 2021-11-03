package com.customertimes.Lesson3;

// Create a class attribute
public class Main {
    int someObject;
    char someChar;
    String someString;
    boolean someBoolean;

    public Main(int one, char two, String four, boolean five ) {
        // Set the initial value for the class attribute someObject
        someObject = one;
        someChar = two;
        someString = four;
        someBoolean = five;
    }

    public static void main(String[] args) {
        // Create an object of class Main (This will call the constructor)
        Main myObj = new Main(1, 's', "some text", true);
        System.out.println("Values of my params: " + myObj.someObject + ", " + myObj.someChar+", "+myObj.someString+", "+myObj.someBoolean);

    }
}
