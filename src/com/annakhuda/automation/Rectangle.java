package com.annakhuda.automation;

public class Rectangle {
    private int width;
    private int height;

    Rectangle() {
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int area() {
        return height * width;
    }
}
