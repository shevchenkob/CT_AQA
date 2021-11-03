package com.customertimes.Lesson9;

import com.customertimes.Lesson4.personals_enums.NurseEnum;

public class NursesModel {

    public NurseEnum category;

    NursesModel(NurseEnum category){
        this.category = category;
    }

    public NurseEnum getCategory() {
        return category;
    }

    public void setCategory(NurseEnum category) {
        this.category = category;
    }


}
