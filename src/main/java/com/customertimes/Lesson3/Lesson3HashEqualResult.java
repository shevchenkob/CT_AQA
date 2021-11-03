package com.customertimes.Lesson3;

public class Lesson3HashEqualResult {

    public static void main(String... args) {

        Lesson3HashEquals value1 = new Lesson3HashEquals("somevalue", "newvalue");
        Lesson3HashEquals value2 = new Lesson3HashEquals("somevalue", "newvalue");

        System.out.println("Hashcode of value1: " + value1.hashCode());
        System.out.println("Hashcode of value2: " + value2.hashCode());

        System.out.println("If hashcode of value1 equal to hashcode value2 "+ value1.equals(value2) );

    }

}
