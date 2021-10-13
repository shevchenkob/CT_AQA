package com.customertimes.Lesson4;

public class Pharmacist extends Hospital_Personal {
    public String drugs;

    @Override
    public void work() {
        System.out.println("I work with pills");
    }
}
