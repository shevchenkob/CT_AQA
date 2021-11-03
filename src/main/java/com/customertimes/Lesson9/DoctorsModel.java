package com.customertimes.Lesson9;

public class DoctorsModel {

    private int pricePerVisit;
    private SurgeonModel surgeonModel;
    private TherapistModel therapistModel;

    public int getPricePerVisit() {
        return pricePerVisit;
    }

    public void setPricePerVisit(int pricePerVisit) {
        this.pricePerVisit = pricePerVisit;
    }

    public SurgeonModel getSurgeonModel() {
        return surgeonModel;
    }

    public void setSurgeonModel(SurgeonModel surgeonModel) {
        this.surgeonModel = surgeonModel;
    }

    public TherapistModel getTherapistModel() {
        return therapistModel;
    }

    public void setTherapistModel(TherapistModel therapistModel) {
        this.therapistModel = therapistModel;
    }

}
