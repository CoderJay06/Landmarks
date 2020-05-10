package com.example.java;

public class ManMadeLandmark extends Landmark {
    private Integer yearBuilt;
    private String builtByName;

    @Override
    public void printLandmark() {

    }

    public ManMadeLandmark() {

    }

    public ManMadeLandmark(String name,
                           String location,
                           String type,
                           Integer year,
                           String builtBy) {
        super(name, location, type);
        yearBuilt = year;
        builtByName = builtBy;
    }

    public void setYearBuilt(Integer year) {
        yearBuilt = year;
    }

    public void setBuiltByName(String builtBy) {
        builtByName = builtBy;
    }

    public Integer getYearBuilt() {
        return yearBuilt;
    }

    public String getBuiltByName() {
        return builtByName;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
