package com.customertimes.Lesson4;

import com.customertimes.Lesson4.my_interfaces.IRescue;
import com.customertimes.Lesson4.personals_enums.DoctorsEnum;

public class Therapist extends Doctors implements IRescue {

    public DoctorsEnum rankTherap;

    Therapist(long id, int dateOfBirth, String name, String squad, int pricePerVisit, DoctorsEnum rankTherap) {
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
