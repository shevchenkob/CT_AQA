package com.customertimes.Lesson4;

import com.customertimes.Lesson4.my_interfaces.IHealth;
import com.customertimes.Lesson4.my_interfaces.IProfilact;

public class Pharmacist extends Hospital_Personal implements IHealth, IProfilact {
    public String drugs;

    Pharmacist(long id, int dateOfBirth, String name, String department, String drugs) {
        super(id, dateOfBirth, name, department);
        this.drugs = drugs;
    }

    @Override
    public void work() {
        System.out.println("I work with pills");
    }

    @Override
    public void getHealth() {
        System.out.println("Pharmacist provide health");
    }

    @Override
    public void getProfilact() {
        System.out.println("Pharmacist provide profilact");
    }
}
