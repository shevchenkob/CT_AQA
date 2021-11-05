package com.customertimes.Lesson9;

import com.customertimes.Lesson4.Administrators;

public class AdministratorsModel {

    public String workplace;

    AdministratorsModel (String workplace){
        this.workplace = workplace;
    }

    public AdministratorsModel() {

    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }
}
