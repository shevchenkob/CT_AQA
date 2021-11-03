package com.customertimes.Lesson9;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DoctorsModel {

    @JsonProperty("pricePerVisit")
    private int pricePerVisit;

    @JsonProperty("surgeonModel")
    private SurgeonModel surgeonModel;

    @JsonProperty("therapistModel")
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
