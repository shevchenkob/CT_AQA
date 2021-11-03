package com.customertimes.Lesson9;

import com.customertimes.Lesson4.PersonalsEnums.doctors_enum;

public class SurgeonModel {
    public doctors_enum rankSurg;
    private String scalpel;

    public doctors_enum getRankSurg() {
        return rankSurg;
    }

    public void setRankSurg(doctors_enum rankSurg) {
        this.rankSurg = rankSurg;
    }

    public String getScalpel() {
        return scalpel;
    }

    public void setScalpel(String scalpel) {
        this.scalpel = scalpel;
    }


}
