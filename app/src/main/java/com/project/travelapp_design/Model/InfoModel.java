package com.project.travelapp_design.Model;

public class InfoModel {
    String location;
    Integer Images;

    public InfoModel(String location, Integer images) {
        this.location = location;
        this.Images = images;
    }

    public String getLocation() {
        return location;
    }

    public Integer getImages() {
        return Images;
    }
}
