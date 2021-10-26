package com.customertimes.Lesson4.MyInterfaces;

public interface IRescue {
    void getRescue();
    default void getCareful(){
        System.out.println("Be careful");
    }
}
