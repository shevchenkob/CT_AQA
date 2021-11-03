package com.customertimes.Lesson4.MyInterfaces;

public interface IProfilact {
    void getProfilact();
    default void getActive(){
        System.out.println("Run every day");
    }
}
