package com.example.thelearningapp.Model;

import com.example.thelearningapp.Adapter.VideoRecyclerAdapter;

import java.util.List;

public class Model {

    private String liveTime,subject,name,yrsExp,profIn;
    private int teacherImg;
    private boolean expanded;
    List<VideoModel> videoModels;

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

//    public Model() {
//        this.liveTime = liveTime;
//        this.subject = subject;
//        this.name = name;
//        this.yrsExp = yrsExp;
//        this.profIn = profIn;
//        this.teacherImg = teacherImg;
//        this.expanded = false;
//    }


    public Model(String liveTime, String subject, String name, String yrsExp, String profIn, int teacherImg, /*boolean expanded,*/ List<VideoModel> videoModels) {
        this.liveTime = liveTime;
        this.subject = subject;
        this.name = name;
        this.yrsExp = yrsExp;
        this.profIn = profIn;
        this.teacherImg = teacherImg;
//        this.expanded = expanded;

        this.videoModels = videoModels;
    }

    public List<VideoModel> getVideoModels() {
        return videoModels;
    }

    public void setVideoModels(List<VideoModel> videoModels) {
        this.videoModels = videoModels;
    }

    public String getLiveTime() {
        return liveTime;
    }

    public void setLiveTime(String liveTime) {
        this.liveTime = liveTime;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYrsExp() {
        return yrsExp;
    }

    public void setYrsExp(String yrsExp) {
        this.yrsExp = yrsExp;
    }

    public String getProfIn() {
        return profIn;
    }

    public void setProfIn(String profIn) {
        this.profIn = profIn;
    }

    public int getTeacherImg() {
        return teacherImg;
    }

    public void setTeacherImg(int teacherImg) {
        this.teacherImg = teacherImg;
    }
}
