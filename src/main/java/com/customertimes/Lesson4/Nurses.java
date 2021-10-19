package com.customertimes.Lesson4;

import com.customertimes.Lesson4.PersonalsEnums.nurse_enum;

public class Nurses extends Ambulance_Personal {
    public nurse_enum category;

    Nurses(long id, int dateOfBirth, String name, String squad, nurse_enum category) {
        super(id, dateOfBirth, name, squad);
        this.category = category;
    }

    Nurses(long id, int dateOfBirth, String name, String squad) {
        super(id, dateOfBirth, name, squad);

    }

    @Override
    public String toString() {
        String result = "Id = " + id + ". Birthdate = " + dateOfBirth + ". Name is: " + name + ". Squad: " + squad + ". Category: " + category;
        return result;
    }

    ;

    @Override
    public void work() {
        System.out.println("I work with injector");
    }
}
