package com.customertimes.Lesson9;

import com.customertimes.Lesson4.personals_enums.NurseEnum;
import com.fasterxml.jackson.annotation.JsonProperty;

public class NursesModel {

    @JsonProperty("category")
    public NurseEnum category;

    NursesModel(NurseEnum category){
        this.category = category;
    }

    public NursesModel() {

    }

    public NurseEnum getCategory() {
        return category;
    }

    public void setCategory(NurseEnum category) {
        this.category = category;
    }


}