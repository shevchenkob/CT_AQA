package com.customertimes.Lesson4;

public class Nurses extends  Hospital_Personal{
    public int pricePerProcedure;

    @Override
    public void work() {
        System.out.println("I work with injector");
    }
}
