package Lesson9;

public class AmbulancePersonalModel {

    public String squad;
    private DoctorsModel doctorsModel;
    private NursesModel nursesModel;

    public String getSquad() {
        return squad;
    }

    public void setSquad(String squad) {
        this.squad = squad;
    }

    public DoctorsModel getDoctorsModel() {
        return doctorsModel;
    }

    public void setDoctorsModel(DoctorsModel doctorsModel) {
        this.doctorsModel = doctorsModel;
    }

    public NursesModel getNursesModel() {
        return nursesModel;
    }

    public void setNursesModel(NursesModel nursesModel) {
        this.nursesModel = nursesModel;
    }
}
