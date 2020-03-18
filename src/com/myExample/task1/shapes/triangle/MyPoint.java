package com.myExample.task1.shapes.triangle;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public int[] getXY() {
        int[] XY = new int[]{x, y};
        return XY;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x=" + x +
                ", y=" + y;
    }

    public double distance(int x, int y) {
        double distance = Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
        return distance;
    }

    public double distance(MyPoint another) {
        double distance = Math.sqrt(Math.pow((this.x - another.x), 2) + Math.pow((this.y - another.y), 2));
        return distance;
    }

    public double distance() {
        double distance = Math.sqrt(Math.pow((this.x), 2) + Math.pow((this.y), 2));
        return distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != getClass()) return false;
        MyPoint myPoint = (MyPoint) o;
        return myPoint.x == x
                && myPoint.y == y;
    }

    @Override
    public int hashCode() {
        int result = 23;
        result = 31 * result + x;
        result = 31 * result + y;
        return result;
    }
}
