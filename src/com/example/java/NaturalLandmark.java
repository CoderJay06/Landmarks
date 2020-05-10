package com.example.java;

public class NaturalLandmark extends Landmark {
    private String dateEstablished;

    @Override
    public void printLandmark() {

    }

    public NaturalLandmark() {

    }

    public NaturalLandmark(String name,
                           String location,
                           String type,
                           String date) {
        super(name, location, type);
        dateEstablished = date;
    }

    public void setDateEstablished(String date) {
        dateEstablished = date;
    }

    public String getDateEstablished() {
        return dateEstablished;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
