package com.customertimes.Lesson9;

public class AccountantModel {
    private String stamp;

    AccountantModel (String stamp){
        this.stamp = stamp;
    }

    public AccountantModel() {

    }

    public String getStamp() {
        return stamp;
    }

    public void setStamp(String stamp) {
        this.stamp = stamp;
    }
}
