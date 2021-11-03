package com.customertimes.Lesson9;

import com.customertimes.Lesson4.personals_enums.DoctorsEnum;

public class SurgeonModel {
    public DoctorsEnum rankSurg;
    private String scalpel;

    public DoctorsEnum getRankSurg() {
        return rankSurg;
    }

    public void setRankSurg(DoctorsEnum rankSurg) {
        this.rankSurg = rankSurg;
    }

    public String getScalpel() {
        return scalpel;
    }

    public void setScalpel(String scalpel) {
        this.scalpel = scalpel;
    }


}
