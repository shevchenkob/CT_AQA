package com.customertimes.Lesson4;

import com.customertimes.Lesson4.PersonalsEnums.NurseEnum;

public class Nurses extends  Hospital_Personal{
    NurseEnum category;

    @Override
    public void work() {
        System.out.println("I work with injector");
    }
}
