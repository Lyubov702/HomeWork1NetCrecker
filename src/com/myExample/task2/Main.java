package com.myExample.task2;

public class Main {
    public static void main(String[] args) {
        Ball ball = new Ball(4, 4, 1, 2, 90);
        Ball ball1 = new Ball(10, 10, 4, 1, -180);
        System.out.println(ball);
        System.out.println(ball1);

        Container container = new Container(0, 10, 10, 10);
        System.out.println(container);
        System.out.println("Bool in container " + container.collides(ball)); //true
        System.out.println("Bool in container " + container.collides(ball1)); //false

        ball.move();
        System.out.println(ball);
        ball.reflectHorizontal();
        System.out.println("Reflect Horizontal " + ball);

        MyComplex complex1 = new MyComplex(4, 7);
        MyComplex complex2 = new MyComplex(4, 7);
        System.out.println("сomplex1=complex2?" + complex1.equals(complex2)); //true
        System.out.println("complex1+comlex2=" + complex1.add(complex2));
        System.out.println("complex1*comlex2=" + complex1.multiply(complex2));

        double[] array = new double[]{4.0, 19.0, 7.0, 1.0, 10.0, 29.0};
        MyPolynomial polynom = new MyPolynomial(array);
        MyPolynomial polynom2 = new MyPolynomial(array);
        System.out.println(polynom);
        System.out.println(polynom2);
        System.out.println("Sum = " + polynom.add(polynom2));
        MyPolynomial polynom3 = new MyPolynomial(new double[]{4.0, 1.0});
        MyPolynomial polynom4 = new MyPolynomial(new double[]{4.0, 1.0});
        System.out.println(polynom.equals(polynom2));
        System.out.println(polynom.equals(polynom3));
        System.out.println(polynom3);
        System.out.println(polynom.hashCode());
        System.out.println(polynom4);
        System.out.println(polynom4.hashCode());
        System.out.println("multiply= " + polynom3.multiply(polynom4));
    }
}
