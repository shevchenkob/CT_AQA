package com.customertimes.Lesson4;

public class Administrators extends Hospital_Personal {
    public String workplace;

    Administrators(long id, int dateOfBirth, String name, String department, String workplace) {
        super(id, dateOfBirth, name, department);
        this.workplace = workplace;
    }

    @Override
    public void work() {
        System.out.println("I work with schedule");
    }
}
