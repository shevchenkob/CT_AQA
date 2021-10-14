package com.customertimes.Lesson4;

import com.customertimes.Lesson4.PersonalsEnums.DoctorsEnum;
import com.customertimes.Lesson4.PersonalsEnums.NurseEnum;

public class Runner {

    public static void main(String... args) {
        Surgeon surgeon = new Surgeon(10, 1980, "Ivan", "emergency", 50, DoctorsEnum.FIRST_RANK);
        surgeon.work();
        System.out.println("Surgeon name is: " + surgeon.name);

        Therapist therapist = new Therapist(15, 1975, "Vasya", "usual", 40, DoctorsEnum.HIGHEST_RANK);
        therapist.work();
        System.out.println("Therapist rank is: " + therapist.rankTherap);

        Nurses nurses = new Nurses(8, 1995, "Kate", "profilact", NurseEnum.SECOND_CATEGORY);
        nurses.work();
        System.out.println("Nurse squad is: " + nurses.squad);

        Administrators administrators = new Administrators(5, 2000, "Ann", "vaccination", "reception");
        administrators.work();
        System.out.println("Administrator workplace is: " + administrators.workplace);

        Accountant accountant = new Accountant(52, 1992, "John", "protection", "sighting");
        accountant.work();
        System.out.println("Accountant birthdate is: " + accountant.dateOfBirth);

        Pharmacist pharmacist = new Pharmacist(37, 1988, "Sara", "giveAway", "aspirin");
        pharmacist.work();
        System.out.println("Pharmacist department is: " + pharmacist.department);

        /* Mixed using polymorphism */
        Personal newNurse = new Nurses(22, 2001, "Megan", "intensiveCare");
        System.out.println("New nurse name is: " + newNurse.name);

        Hospital_Personal  newAccountant = new Accountant(6, 1888, "Elizabet", "newDep", "newStamp");
        accountant.work();
        System.out.println("New accountant birthday: " + newAccountant.dateOfBirth);

        System.out.println(newNurse.toString());

        accountant.setStamp("myStamp");
        accountant.getStamp();


    }
}
