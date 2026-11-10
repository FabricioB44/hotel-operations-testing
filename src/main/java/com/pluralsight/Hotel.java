package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuits;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuits = 0;
        this.bookedBasicRooms = 0;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms,
                 int bookedSuits, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuits = bookedSuits;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuits() {
        return bookedSuits;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    public int getAvailableSuites(){
        return numberOfSuites - bookedSuits;
    }

    public int getAvailableRooms(){
        return numberOfRooms - bookedBasicRooms;
    }

    public boolean bookRoom(int roomCount, boolean suite){
        if (suite) {
            if (roomCount <= getAvailableSuites()) {
                bookedSuits += roomCount;
                return true;
            }
        } else if (roomCount <= getAvailableRooms()) {
            bookedBasicRooms += roomCount;
            return true;
        }
        return false;
    }
}
