package com.customertimes.Lesson4.my_interfaces;

public interface IHealth {
    void getHealth();
    default void getStrong(){
        System.out.println("Be strong");
    };
}
