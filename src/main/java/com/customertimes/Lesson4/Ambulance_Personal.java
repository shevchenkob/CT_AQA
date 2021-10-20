package com.customertimes.Lesson4;

public abstract class Ambulance_Personal extends Personal {
    public String squad;

    Ambulance_Personal(long id, int dateOfBirth, String name, String squad) {
        super(id, dateOfBirth, name);
        this.squad = squad;
    }
}
