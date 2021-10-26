package com.customertimes.Lesson8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyCollections {

    public static void main(String... args) {
        myList();

    }

    public static void myList() {
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
}
