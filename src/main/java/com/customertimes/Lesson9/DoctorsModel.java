package com.customertimes.Lesson9;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DoctorsModel {

    @JsonProperty("pricePerVisit")
    public int pricePerVisit;

    @JsonProperty("surgeonModel")
    public SurgeonModel surgeonModel;

    @JsonProperty("therapistModel")
    public TherapistModel therapistModel;

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
