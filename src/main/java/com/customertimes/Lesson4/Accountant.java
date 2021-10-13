package com.customertimes.Lesson4;

public class Accountant extends Hospital_Personal {

    private String stamp;

    Accountant(long id, int dateOfBirth, String name, String department, String stamp) {
        super(id, dateOfBirth, name, department);
        this.stamp = stamp;
    }

    @Override
    public void work() {
        System.out.println("I work with money");
    }
}
