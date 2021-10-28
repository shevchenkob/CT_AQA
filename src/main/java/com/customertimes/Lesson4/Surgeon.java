package com.customertimes.Lesson4;

import com.customertimes.Lesson4.MyInterfaces.IRescue;
import com.customertimes.Lesson6.SurgeonNotWorkException;
import com.customertimes.Lesson4.PersonalsEnums.doctors_enum;

public class Surgeon extends Doctors implements IRescue {

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

    @Override
    public void getRescue() {
        System.out.println("Surgeon provide rescue");

    }

    public String checkName(String tempName) {
        if (name != "Vasya") {
            throw new SurgeonNotWorkException("Illegal surgeon name");
        }
        return name;
    }
}
