package com.customertimes.Lesson8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyCollections {

    public static void main(String... args) {
        // myArrayList();
        myLinkedList();

    }

    public static void myArrayList() {
        List<String> myArray = new ArrayList<>();
        myArray.add(0, "Volvo");
        myArray.add(1, "Tesla");
        myArray.add(2, "Mazda");
        myArray.add(3, "VW");
        myArray.add(4, "KIA");
        myArray.add(5, "Porsche");
        myArray.add(6, "Hyundai");
        myArray.add(7, "Lada");
        myArray.add(8, "Toyota");
        myArray.add(9, "Lexus");

        for (int i = 0; i < myArray.size(); i++) {
            System.out.println(myArray.get(i) + "_" + i);
        }
    }

    public static void myLinkedList() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Dog");
        list.add("Cat");
        list.add("Mouse");
        list.add("Bear");
        list.add("Rat");
        list.add("Cow");
        list.add("Horse");
        list.add("Pig");
        list.add("Rabbit");
        list.add("Bull");

        System.out.println("List before removing: " + list);

        list.remove(2);
        list.remove(3);
        list.remove(5);

        System.out.println("List after removing: " + list);

    }
}
