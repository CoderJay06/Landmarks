package com.example.java;

public abstract class Landmark {
    private String landmarkName;
    private String landmarkLocation;
    private String landmarkType;

    public abstract void printLandmark();

    public Landmark() {

    }

    public Landmark(String name, String location, String type) {
        landmarkName = name;
        landmarkLocation = location;
        landmarkType = type;
    }

    public void setName(String name) {
        landmarkName = name;
    }

    public void setLocation(String location) {
        landmarkLocation = location;
    }

    public void setType(String type) {
        landmarkType = type;
    }

    public String getName() {
        return landmarkName;
    }

    public String getLocation() {
        return landmarkLocation;
    }

    public String getType() {
        return landmarkType;
    }

    public String toString() {
        String result =
                "\nAll Landmark Details: "
                        + getName() + ", " + getType() + ", " + getLocation();
        return result;
    }
}
