package Lesson9;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PersonalModel {

    protected long id;
    public int dateOfBirth;
    private String name;
    private LocalDateTime time;
    private AmbulancePersonalModel ambulancePersonalModel;
    private HospitalPersonalModel hospitalPersonalModel;

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
