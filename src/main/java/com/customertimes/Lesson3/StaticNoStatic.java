package com.customertimes.Lesson3;

import com.sun.tools.javac.Main;

import java.lang.reflect.Method;

public class StaticNoStatic {
     static void staticMethod(){
        System.out.println("I am static.");
    }

    public void notStatic(){
        System.out.println("I am not static.");
    }

    public static void main(String[] args) {
         staticMethod();
         StaticNoStatic objectForPublic = new StaticNoStatic();
         objectForPublic.notStatic();

        Method[] getAllMeths = StaticNoStatic.class.getMethods();
        for (Method i : getAllMeths) {
            System.out.println(i);
        }
    }
}
