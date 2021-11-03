package com.customertimes.Lesson4.my_interfaces;

public interface IRescue {
    void getRescue();
    default void getCareful(){
        System.out.println("Be careful");
    }
}
