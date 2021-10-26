package com.customertimes.Lesson8;

import java.util.*;

public class MyCollections {

    public static void main(String[] args) {
        // myArrayList();
        //myLinkedList();
        mySet();

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

    public static void mySet(){
        Set<String> data = new LinkedHashSet<>();
        data.add("one");
        data.add("two");
        data.add("one");
        data.add("four");
        data.add("five");
        data.add("one");
        data.add("seven");
        data.add("one");
        data.add("nine");
        data.add("ten");

        int index = 2;

        /* Below method give error: Exception in thread "main" java.lang.ArrayStoreException: java.lang.String */
//        Integer[] dataArray = new Integer[data.size()];
//        dataArray = data.toArray(dataArray);
//        System.out.println("Element at index " + index + "is: " + dataArray[index-1]);


        Iterator<String> it = data.iterator();
        int currIndex = 0;
        String CurrentElement = null;
        while (it.hasNext()) {
            CurrentElement = it.next();
            if (currIndex == index - 1) {
                System.out.println("Element at index " + index + " is: " + CurrentElement);
                break;
            }
            currIndex++;
        }
    }
}
