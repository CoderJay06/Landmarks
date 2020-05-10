package com.example.java;

public class Statue extends ManMadeLandmark {
    private String landmarkSize;


    public Statue() {

    }

    public Statue(String name,
                  String location,
                  String type,
                  Integer year,
                  String builtBy,
                  String size) {
        super(name, location, type, year, builtBy);
        landmarkSize = size;
    }

    public void setLandmarkSize(String size) {
        landmarkSize = size;
    }

    public String getLandmarkSize() {
        return landmarkSize;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + getLandmarkSize();
    }
}
