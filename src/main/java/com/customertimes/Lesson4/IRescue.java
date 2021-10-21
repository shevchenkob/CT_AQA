package com.customertimes.Lesson4;

public interface IRescue {
    void getRescue();
    default void getCareful(){
        System.out.println("Be careful");
    }
}
