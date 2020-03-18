package com.myExample.task1.shapes.triangle;

import java.math.BigDecimal;
import java.util.Objects;

public class MyTriangle {

    private MyPoint v1 = new MyPoint();
    private MyPoint v2 = new MyPoint();
    private MyPoint v3 = new MyPoint();

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=(" + v1.getX() + " " + v1.getY() +
                "), v2=(" + v2.getX() + " " + v2.getY() +
                "), v3=(" + v3.getX() + " " + v3.getY() +
                ")}";
    }

    public double getPerimeter() {
        double perimeter = v1.distance(v2) + v1.distance(v3) + v3.distance(v2);
        return perimeter;
    }

    public String getType() {
        //the sides of the triangle

        BigDecimal side1 = BigDecimal.valueOf(v1.distance(v2));
        BigDecimal side2 = BigDecimal.valueOf(v1.distance(v3));
        BigDecimal side3 = BigDecimal.valueOf(v3.distance(v2));

        String result = null;

        if ((side1.compareTo(side2) == 0) && (side1.compareTo(side3) == 0) && (side2.compareTo(side3)== 0)) {

            result = String.valueOf(TypeOfTriangle.EQUILATERAL);
        }

        if ((side1.compareTo(side2) == 0) && (side1.compareTo(side3) != 0) && (side2.compareTo(side3) != 0)
                || (side1.compareTo(side3) == 0) && (side2.compareTo(side3) != 0) && (side1.compareTo(side2) != 0)
                || (side2.compareTo(side3) == 0) && (side1.compareTo(side2) != 0) && (side1.compareTo(side3) != 0)) {

            result = String.valueOf(TypeOfTriangle.ISOSCELES);
        }

        if ((side1.compareTo(side2) != 0) && (side1.compareTo(side3) != 0) && (side2.compareTo(side3) != 0)) {
            result = String.valueOf(TypeOfTriangle.SCALENE);
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        MyTriangle triangle = (MyTriangle) o;

        return Objects.equals(v1, triangle.v1) &&
                Objects.equals(v2, triangle.v2) &&
                Objects.equals(v3, triangle.v3);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + v1.hashCode();
        result = 31 * result + v2.hashCode();
        result = 31 * result + v3.hashCode();

        return result;
    }
}
