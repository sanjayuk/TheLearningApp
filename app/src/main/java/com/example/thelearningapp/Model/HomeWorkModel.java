package com.example.thelearningapp.Model;

public class HomeWorkModel {
    String hwSubject,hwAssigned,hwCompleetion,hwChecked,hwDay,hwMonth;

    public HomeWorkModel(String hwSubject, String hwAssigned, String hwCompleetion, String hwChecked, String hwDay, String hwMonth) {
        this.hwSubject = hwSubject;
        this.hwAssigned = hwAssigned;
        this.hwCompleetion = hwCompleetion;
        this.hwChecked = hwChecked;
        this.hwDay = hwDay;
        this.hwMonth = hwMonth;
    }

    public String getHwSubject() {
        return hwSubject;
    }

    public void setHwSubject(String hwSubject) {
        this.hwSubject = hwSubject;
    }

    public String getHwAssigned() {
        return hwAssigned;
    }

    public void setHwAssigned(String hwAssigned) {
        this.hwAssigned = hwAssigned;
    }

    public String getHwCompleetion() {
        return hwCompleetion;
    }

    public void setHwCompleetion(String hwCompleetion) {
        this.hwCompleetion = hwCompleetion;
    }

    public String getHwChecked() {
        return hwChecked;
    }

    public void setHwChecked(String hwChecked) {
        this.hwChecked = hwChecked;
    }

    public String getHwDay() {
        return hwDay;
    }

    public void setHwDay(String hwDay) {
        this.hwDay = hwDay;
    }

    public String getHwMonth() {
        return hwMonth;
    }

    public void setHwMonth(String hwMonth) {
        this.hwMonth = hwMonth;
    }
}
