package com.example.thelearningapp.Model;

public class VideoModel {
    private int videoImage,itemId;
    private String videoTitle;

    public VideoModel(int videoImage, int itemId, String videoTitle) {
        this.videoImage = videoImage;
        this.itemId = itemId;
        this.videoTitle = videoTitle;
    }

    public int getVideoImage() {
        return videoImage;
    }

    public void setVideoImage(int videoImage) {
        this.videoImage = videoImage;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }


}
