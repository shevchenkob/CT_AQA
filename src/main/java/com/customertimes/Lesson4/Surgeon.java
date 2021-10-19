package com.customertimes.Lesson4;

import com.customertimes.Lesson4.PersonalsEnums.doctors_enum;

public class Surgeon extends Doctors {

    public doctors_enum rankSurg;
    private String scalpel;

    Surgeon(long id, int dateOfBirth, String name, String squad, int pricePerVisit, doctors_enum rankSurg) {
        super(id, dateOfBirth, name, squad, pricePerVisit);
        this.rankSurg = rankSurg;
    }

    @Override
    public void work() {
        System.out.println("I work with scalpel");
    }

    public String getScalpel() {
        return scalpel;
    }

    public void setScalpel(String scalpel) {
        this.scalpel = scalpel;
    }
}
