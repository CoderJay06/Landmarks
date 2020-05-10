package com.example.java;
import java.util.ArrayList;

public class TestLandmark {
    public static void main(String[] args){
        // Create new instances of each class
        ManMadeLandmark mLandmark = new ManMadeLandmark();
        NaturalLandmark nLandmark = new NaturalLandmark();
        Statue statue = new Statue();
        Mountain mountain = new Mountain();
        ArrayList<Statue> statueList = new ArrayList<>();
        ArrayList<Mountain> mountainList = new ArrayList<>();
        ArrayList<ManMadeLandmark> mLandmarkList = new ArrayList<>();
        ArrayList<NaturalLandmark> nLandmarkList = new ArrayList<>();
        ArrayList<ManMadeLandmark> mLandmarkList2 = new ArrayList<>();
        ArrayList<NaturalLandmark> nLandmarkList2 = new ArrayList<>();

        // Overloaded constructor instances
        ManMadeLandmark mLandmark2 = new ManMadeLandmark(
                "The Colosseum",
                "Rome, Italy",
                "Amphitheater",
                80,
                "Vespasian");
        NaturalLandmark nLandmark2 = new NaturalLandmark(
                "Devils Tower",
                "Crook County, Wyoming, United States",
                "Summit",
                "September 24, 1906");

        // Set ManMade Landmark details
        mLandmark.setName("Eiffel Tower");
        mLandmark.setType("Tower");
        mLandmark.setLocation("Paris, France");
        mLandmark.setYearBuilt(1887);
        mLandmark.setBuiltByName("Gustave Eiffel");

        // Set Natural Landmark details
        nLandmark.setName("Grand Canyon");
        nLandmark.setType("National Park");
        nLandmark.setLocation("Arizona, U.S.");
        nLandmark.setDateEstablished("February 26, 1919");

        // Set statue details
        statue.setName("Statue Of Liberty");
        statue.setType("Statue");
        statue.setLocation("New York, New York");
        statue.setLandmarkSize("305 ft tall, 225 Tons");

        // Set Mountain details
        mountain.setName("Mount Everest");
        mountain.setType("Mountain");
        mountain.setLocation("Asia");
        mountain.setLandmarkHeight("29,029 feet");

        // Instantiate new instance from PrintLandmarkDetails class
        PrintLandmarkDetails printDetails = new PrintLandmarkDetails();

        printDetails.landmarksGreeting();

        // Print ManMade Landmark examples
        System.out.println("ManMade Landmarks:");
        System.out.println("------------------");
        printDetails.printName();
        System.out.println(mLandmark.getName());
        printDetails.printType();
        System.out.println(mLandmark.getType());
        printDetails.printLocation();
        System.out.println(mLandmark.getLocation());
        printDetails.yearBuilt();
        System.out.println(mLandmark.getYearBuilt());
        printDetails.builtByName();
        System.out.println(mLandmark.getBuiltByName());


        // Print out all mLandmark details using toString
        // with runtime Polymorphism
        mLandmarkList.add(mLandmark);
        for (ManMadeLandmark manMadeLandmark : mLandmarkList) {
            System.out.println(manMadeLandmark.toString());
        }

        printDetails.printName();
        System.out.println(mLandmark2.getName());
        printDetails.printType();
        System.out.println(mLandmark2.getType());
        printDetails.printLocation();
        System.out.println(mLandmark2.getLocation());
        printDetails.yearBuilt();
        System.out.println(mLandmark2.getYearBuilt() + " AD");
        printDetails.builtByName();
        System.out.println(mLandmark2.getBuiltByName());

        // Print out all mLandmark2 details using toString
        mLandmarkList2.add(mLandmark2);
        for (ManMadeLandmark manMadeLandmark : mLandmarkList2) {
            System.out.println(manMadeLandmark.toString());
        }

        // Print Statue class details
        printDetails.printName();
        System.out.println(statue.getName());
        printDetails.printType();
        System.out.println(statue.getType());
        printDetails.printLocation();
        System.out.println(statue.getLocation());
        printDetails.landmarkSize();
        System.out.println(statue.getLandmarkSize());

        // Print out all statue details using toString
        statueList.add(statue);
        for (Statue value : statueList) {
            System.out.println(value.toString());
        }

        // Print Natural Landmark examples
        System.out.println("\nNatural Landmarks:");
        System.out.println("------------------");
        printDetails.printName();
        System.out.println(nLandmark.getName());
        printDetails.printType();
        System.out.println(nLandmark.getType());
        printDetails.printLocation();
        System.out.println(nLandmark.getLocation());
        printDetails.dateEstablished();
        System.out.println(nLandmark.getDateEstablished());

        // Print out all nLandmark details using toString
        nLandmarkList.add(nLandmark);
        for (NaturalLandmark naturalLandmark : nLandmarkList) {
            System.out.println(naturalLandmark.toString());
        }


        printDetails.printName();
        System.out.println(nLandmark2.getName());
        printDetails.printType();
        System.out.println(nLandmark2.getType());
        printDetails.printLocation();
        System.out.println(nLandmark2.getLocation());
        printDetails.dateEstablished();
        System.out.println(nLandmark2.getDateEstablished());

        // Print out all nLandmark2 details using toString
        nLandmarkList2.add(nLandmark2);
        for (NaturalLandmark naturalLandmark2 : nLandmarkList2) {
            System.out.println(naturalLandmark2.toString());
        }

        // Print Mountain class details
        printDetails.printName();
        System.out.println(mountain.getName());
        printDetails.printType();
        System.out.println(mountain.getType());
        printDetails.printLocation();
        System.out.println(mountain.getLocation());
        printDetails.landmarkHeight();
        System.out.println(mountain.getLandmarkHeight());

        // Print out all mountain details using toString
        mountainList.add(mountain);
        for (Mountain value : mountainList) {
            System.out.println(value.toString());
        }

    }
}
