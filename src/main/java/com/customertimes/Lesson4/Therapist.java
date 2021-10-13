package com.customertimes.Lesson4;

import com.customertimes.Lesson4.PersonalsEnums.DoctorsEnum;

public class Therapist extends Doctors{

    DoctorsEnum rankTherap;

    Therapist(long id, int dateOfBirth, String name, String squad, int pricePerVisit, DoctorsEnum rankTherap) {
        super(id, dateOfBirth, name, squad, pricePerVisit);
        this.rankTherap = rankTherap;
    }

    @Override
    public void work() {
        System.out.println("I work with symptoms");
    }
}
