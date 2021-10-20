package com.customertimes.Lesson4;

import com.customertimes.Lesson4.PersonalsEnums.doctors_enum;

public class Therapist extends Doctors implements IRescue{

    public doctors_enum rankTherap;

    Therapist(long id, int dateOfBirth, String name, String squad, int pricePerVisit, doctors_enum rankTherap) {
        super(id, dateOfBirth, name, squad, pricePerVisit);
        this.rankTherap = rankTherap;
    }

    @Override
    public void work() {
        System.out.println("I work with symptoms");
    }

    @Override
    public void getRescue() {
        System.out.println("Therapist provide rescue");

    }
}
