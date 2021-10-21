package com.customertimes.Lesson4;

public interface IProfilact {
    void getProfilact();
    default void getActive(){
        System.out.println("Run every day");
    }
}
