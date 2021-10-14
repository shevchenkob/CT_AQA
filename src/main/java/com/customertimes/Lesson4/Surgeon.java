package com.customertimes.Lesson4;

import com.customertimes.Lesson4.PersonalsEnums.DoctorsEnum;

public class Surgeon extends Doctors {

    public DoctorsEnum rankSurg;

    Surgeon(long id, int dateOfBirth, String name, String squad, int pricePerVisit, DoctorsEnum rankSurg) {
        super(id, dateOfBirth, name, squad, pricePerVisit);
        this.rankSurg = rankSurg;
    }

    @Override
    public void work() {
        System.out.println("I work with scalpel");
    }
}
