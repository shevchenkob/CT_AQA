package com.customertimes.Lesson4;

public class Pharmacist extends Hospital_Personal {
    public String drugs;

    Pharmacist(long id, int dateOfBirth, String name, String department, String drugs) {
        super(id, dateOfBirth, name, department);
        this.drugs = drugs;
    }

    @Override
    public void work() {
        System.out.println("I work with pills");
    }
}
