package com.customertimes.Lesson4;

import com.customertimes.Lesson4.PersonalsEnums.DoctorsEnum;

public abstract class Doctors extends Ambulance_Personal {
    private int pricePerVisit;


    Doctors(long id, int dateOfBirth, String name, String squad, int pricePerVisit) {
        super(id, dateOfBirth, name, squad);
        this.pricePerVisit = pricePerVisit;
    }
}
