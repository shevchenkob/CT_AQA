package com.customertimes.Lesson4;

import com.customertimes.Lesson4.MyInterfaces.IHealth;
import com.customertimes.Lesson4.MyInterfaces.IProfilact;
import com.customertimes.Lesson4.MyInterfaces.IRescue;
import com.customertimes.Lesson6.NurseNotWorkException;
import com.customertimes.Lesson4.PersonalsEnums.nurse_enum;

public class Nurses extends Ambulance_Personal implements IHealth, IRescue, IProfilact {
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

    /* Not working */
    public long getID(int i) throws NurseNotWorkException {
        if (id != 100) {
            new NurseNotWorkException("Id of nurse is incorrect!");
        }
        return id;
    }

    //    public long getIdTry(int i) throws NurseNotWorkException {
//        if (id != 100) {
//            try {
//                throw new NurseNotWorkException("Id is wrong");
//            } catch (NurseNotWorkException e) {
//                e.printStackTrace();
//            }
//        }
//        return id;
//    }
    public long getIdTry(int i) throws NurseNotWorkException {
        if (id != 100) {
            throw new NurseNotWorkException("Id is wrong");
        }
        return id;
    }

    @Override
    public void work() {
        System.out.println("I work with injector");
    }

    @Override
    public void getHealth() {
        System.out.println("Nurses provide health");

    }

    @Override
    public void getProfilact() {
        System.out.println("Nurses provide profilact");

    }

    @Override
    public void getRescue() {
        System.out.println("Nurses help rescue");

    }
}
