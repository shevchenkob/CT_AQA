package com.customertimes.Lesson9;

import com.customertimes.Lesson4.Personal;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class PersonalModel {

    @JsonProperty("id")
    protected long id;

    @JsonProperty("dateOfBirth")
    public int dateOfBirth;

    @JsonProperty("name")
    private String name;

    @JsonProperty("time")
    @JsonSerialize(using = ToStringSerializer.class)
    private LocalDateTime time;

    @JsonProperty("ambulancePersonalModel")
    private AmbulancePersonalModel ambulancePersonalModel;

    @JsonProperty("hospitalPersonalModel")
    private HospitalPersonalModel hospitalPersonalModel;

    public PersonalModel(long id, int dateOfBirth, String name, AmbulancePersonalModel ambulancePersonalModel,
                         LocalDateTime time
    ){
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.time = time;
        this.ambulancePersonalModel = ambulancePersonalModel;
    }

    public PersonalModel (){}



    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm a z");

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AmbulancePersonalModel getAmbulancePersonalModel() {
        return ambulancePersonalModel;
    }

    public void setAmbulancePersonalModel(AmbulancePersonalModel ambulancePersonalModel) {
        this.ambulancePersonalModel = ambulancePersonalModel;
    }

    public HospitalPersonalModel getHospitalPersonalModel() {
        return hospitalPersonalModel;
    }

    public void setHospitalPersonalModel(HospitalPersonalModel hospitalPersonalModel) {
        this.hospitalPersonalModel = hospitalPersonalModel;
    }


}