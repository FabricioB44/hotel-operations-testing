package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void setIsOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }
    public void setIsDirty(boolean isDirty) {
        this.isDirty = isDirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean getIsOccupied() {
        return isOccupied;
    }

    public boolean getIsDirty() {
        return isDirty;
    }

    public boolean getIsAvailable() {
        return !isOccupied && !isDirty;
    }

    public void checkIn() {
        isOccupied = true;
        isDirty = true;
    }

    public void checkOut() {
        isOccupied = false;
    }

    public void cleanRoom() {
        if (!isOccupied) {
            isDirty = false;
        } else {
            System.out.println("Cannot clean an occupied room.");
        }
    }
}