package com.example.java;

public class PrintLandmarkDetails implements LandmarkDetails {

    @Override
    public void landmarksGreeting() {
        System.out.println("\nWelcome To The Landmarks App (all landmarks below)\n");
    }

    @Override
    public void printName() {
        System.out.println("\nLandmark Name: ");
    }

    @Override
    public void printLocation() {
        System.out.println("\nLandmark Location: ");
    }

    @Override
    public void printType() {
        System.out.println("\nLandmark Type: ");
    }

    @Override
    public void dateEstablished() {
        System.out.println("\nDate Established: ");
    }

    @Override
    public void yearBuilt() {
        System.out.println("\nYear Built: ");
    }

    @Override
    public void builtByName() {
        System.out.println("\nBuilt By: ");
    }

    @Override
    public void landmarkHeight() {
        System.out.println("\nLandmark Height: ");
    }

    @Override
    public void landmarkSize() {
        System.out.println("\nLandmark size: ");
    }
}
