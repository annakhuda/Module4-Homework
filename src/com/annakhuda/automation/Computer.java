package com.annakhuda.automation;

public class Computer {
    private String brand;
    private double screenSize;
    private int numberOfCores;
    private String type;

    Computer(String brand, double screenSize) {
        this.brand = brand;
        this.screenSize = screenSize;
    }

    public String getBrand() {
        return brand;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public String getType() {
        return type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Computer " + brand + " with screensize " + screenSize + " inches";
    }
}
