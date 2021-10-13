package com.customertimes.Lesson4;

import com.customertimes.Lesson4.PersonalsEnums.DoctorsEnum;

public class Surgeon extends Doctors{

    DoctorsEnum currentRank = DoctorsEnum.FIRST_RANK;

    @Override
    public void work() {
        System.out.println("I work with scalpel");
    }
}
