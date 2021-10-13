package com.customertimes.Lesson4;

public abstract class Hospital_Personal extends Personal{
    public String department;

    Hospital_Personal(long id, int dateOfBirth, String name, String department) {
        super(id, dateOfBirth, name);
        this.department = department;
    }
}
