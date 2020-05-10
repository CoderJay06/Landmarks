package com.example.java;

public class Mountain extends NaturalLandmark {
    private String landmarkHeight;

    public Mountain() {

    }

    public Mountain(String name,
                    String location,
                    String type,
                    String date,
                    String height) {
        super(name, location, type, date);
        landmarkHeight = height;
    }

    public void setLandmarkHeight(String height) {
        landmarkHeight = height;
    }

    public String getLandmarkHeight() {
        return landmarkHeight;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + getLandmarkHeight();
    }
}
