package com.customertimes.Lesson4;

public interface IHealth {
    void getHealth();
    default void getStrong(){
        System.out.println("Be strong");
    };
}
