package com.customertimes.Lesson4;

import com.customertimes.Lesson4.PersonalsEnums.DoctorsEnum;

public class Therapist extends Doctors{

    DoctorsEnum currentRank = DoctorsEnum.HIGHEST_RANK;

    @Override
    public void work() {
        System.out.println("I work with symptoms");
    }
}
