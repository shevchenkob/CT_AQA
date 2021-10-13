package com.customertimes.Lesson4;

import com.customertimes.Lesson4.PersonalsEnums.DoctorsEnum;
import com.customertimes.Lesson4.PersonalsEnums.NurseEnum;

public class Runner {

    public static void main(String... args) {
        Surgeon surgeon = new Surgeon(10, 1980, "Ivan", "emergency", 50, DoctorsEnum.FIRST_RANK);
        surgeon.work();

        Therapist therapist = new Therapist(15, 1975, "Vasya", "usual", 40, DoctorsEnum.HIGHEST_RANK);
        therapist.work();

        Nurses nurses = new Nurses(8, 1995, "Kate", "profilact", NurseEnum.SECOND_CATEGORY);
        nurses.work();

        Administrators administrators= new Administrators(5, 2000, "Ann", "vaccination", "reception");
        administrators.work();

        Accountant accountant = new Accountant(52, 1992, "John", "protection", "sighting");
        accountant.work();

        Pharmacist pharmacist = new Pharmacist(37, 1988, "Sara", "giveAway", "aspirin");
        pharmacist.work();

        Personal newNurse = new Nurses(22, 2001, "Megan", "intensiveCare");
        System.out.println(newNurse.name);
    }
}
