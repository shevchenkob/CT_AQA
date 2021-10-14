package com.customertimes.Lesson4;

public abstract class Hospital_Personal extends Personal{
    public String department;

    public static void notAbstractHospital (String...args) {
        System.out.println("My department is: " + 1);
    }

    Hospital_Personal(long id, int dateOfBirth, String name, String department) {
        super(id, dateOfBirth, name);
        this.department = department;
    }
}
