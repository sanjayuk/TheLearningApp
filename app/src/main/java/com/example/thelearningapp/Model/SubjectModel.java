package com.example.thelearningapp.Model;

import java.io.Serializable;

public class SubjectModel implements Serializable {
    private int subjectImg;
    private String subjectTitle;

    public SubjectModel() {
    }

    public SubjectModel(int subjectImg) {
        this.subjectImg = subjectImg;
    }

    public SubjectModel(int subjectImg, String subjectTitle) {
        this.subjectImg = subjectImg;
        this.subjectTitle = subjectTitle;
    }

    public int getSubjectImg() {
        return subjectImg;
    }

    public void setSubjectImg(int subjectImg) {
        this.subjectImg = subjectImg;
    }

    public String getSubjectTitle() {
        return subjectTitle;
    }

    public void setSubjectTitle(String subjectTitle) {
        this.subjectTitle = subjectTitle;
    }
}
