package com.customertimes.Lesson4;

import com.customertimes.Lesson6.DoctorException;

public abstract class Doctors extends Ambulance_Personal {
    private int pricePerVisit;

    public static void notAbstractDoctorsMethod(String... args) {
        System.out.println("I am not abstract doctor!");
    }


    Doctors(long id, int dateOfBirth, String name, String squad, int pricePerVisit) {
        super(id, dateOfBirth, name, squad);
        this.pricePerVisit = pricePerVisit;
    }

    public int getPricePerVisit() {
        return pricePerVisit;
    }

    public void setPricePerVisit(int pricePerVisit) {
        this.pricePerVisit = pricePerVisit;
    }


    public int checkAge(int age) {
        if (age > 1990) {
            try {
                throw new DoctorException("Too young");
            } catch (DoctorException e) {
                System.out.println(e);
            }
        }
        return age;
    }
}
