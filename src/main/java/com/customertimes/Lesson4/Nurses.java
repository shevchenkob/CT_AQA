package com.customertimes.Lesson4;

import com.customertimes.Lesson4.PersonalsEnums.NurseEnum;

public class Nurses extends  Ambulance_Personal{
    NurseEnum category;

    Nurses(long id, int dateOfBirth, String name, String squad, NurseEnum category) {
        super(id, dateOfBirth, name, squad);
        this.category = category;
    }

    Nurses(long id, int dateOfBirth, String name, String squad) {
        super(id, dateOfBirth, name, squad);

    }

    @Override
    public void work() {
        System.out.println("I work with injector");
    }
}
