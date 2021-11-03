package com.customertimes.Lesson9;

import com.customertimes.Lesson4.Personal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class PersonalModel {

    protected long id;
    public int dateOfBirth;
    private String name;
    private LocalDateTime time;
    private AmbulancePersonalModel ambulancePersonalModel;
    private HospitalPersonalModel hospitalPersonalModel;

    public PersonalModel(long id, int dateOfBirth, String name
                //  LocalDateTime time,
              //    AmbulancePersonalModel ambulancePersonalModel,
              //    HospitalPersonalModel hospitalPersonalModel
    ){
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        //this.time = time;
       // this.ambulancePersonalModel = ambulancePersonalModel;
       // this.hospitalPersonalModel = hospitalPersonalModel;
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
