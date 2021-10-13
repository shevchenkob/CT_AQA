package com.customertimes.Lesson4;

public class Runner {

    public static void main(String... args) {
        Surgeon surgeon = new Surgeon();
        surgeon.work();

        Therapist therapist = new Therapist();
        therapist.work();

        Nurses nurses = new Nurses();
        nurses.work();

        Administrators administrators= new Administrators();
        administrators.work();

        Accountant accountant = new Accountant();
        accountant.work();

        Pharmacist pharmacist = new Pharmacist();
        pharmacist.work();
    }
}
