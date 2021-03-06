package com.customertimes.Lesson4;

import com.customertimes.Lesson6.AccountantException;

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

    /* Getter */
    public String getStamp() {
        return stamp;
    }

    /* Setter */
    public void setStamp(String newStamp) {
        this.stamp = newStamp;
    }


    public void checkStamp(String tempStamp) {
        if (tempStamp != "signature") {
            try {
                throw new AccountantException("Incorrect stamp");
            } catch (AccountantException e) {
                System.out.println(e);
            }
        }
    }
}
