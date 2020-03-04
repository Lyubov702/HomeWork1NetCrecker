package com.myExample.task1;

public class Rectangle {

    private float length = 1.0f;
    private float wigth = 1.0f;

    public Rectangle() {
    }

    public Rectangle(float length, float wigth) {
        this.length = length;
        this.wigth = wigth;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWigth() {
        return wigth;
    }

    public void setWigth(float wigth) {
        this.wigth = wigth;
    }

    public double getArea() {
        return length * wigth;
    }

    public double getPerimetr() {
        return 2 * (length + wigth);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", wigth=" + wigth +
                '}';
    }
}
