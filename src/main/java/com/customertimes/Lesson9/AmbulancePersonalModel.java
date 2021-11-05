package com.customertimes.Lesson9;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class AmbulancePersonalModel {

    @JsonProperty("squad")
    public String squad;

    @JsonProperty("doctorsModel")
    public List<DoctorsModel> doctorsModel;

    @JsonProperty("nursesModel")
    private NursesModel nursesModel;

    public String getSquad() {
        return squad;
    }

    public void setSquad(String squad) {
        this.squad = squad;
    }

    public List<DoctorsModel> getDoctorsModel() {
        return doctorsModel;
    }

    public void setDoctorsModel(List<DoctorsModel> doctorsModel) {
        this.doctorsModel = doctorsModel;
    }

    public NursesModel getNursesModel() {
        return nursesModel;
    }

    public void setNursesModel(NursesModel nursesModel) {
        this.nursesModel = nursesModel;
    }

    public void setDoctorsModel() {
    }
}