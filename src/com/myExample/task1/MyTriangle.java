package com.myExample.task1;

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
        double a = v1.distance(v2);
        double b = v1.distance(v3);
        double c = v3.distance(v2);
        String result = null;

        if (a == b && a == c && b == c) {
            result = "Equilateral";
        }

        if (a == b && a != c && b != c || a == c && c != b && a != b || b == c && b != a && c != a) {
            result = "Isosceles";
        }
        if (a != b && a != c && b != c) {
            result = "Scalene";
        }

        if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)
                || Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)
                || Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)) {
            result = "Rectangular";
        }

        return result;
    }
}
