package com.myExample.task2.polynomial;

import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        String result = "" + coeffs[coeffs.length - 1];
        for (int i = coeffs.length - 2; i >= 1; i--) {
            result += "x^" + (i + 2) + "+" + coeffs[i];
        }
        return result += "x+" + coeffs[0];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o==null || o.getClass()!=this.getClass()) return false;
        MyPolynomial polynomial = (MyPolynomial) o;

        return Arrays.equals(coeffs, polynomial.coeffs);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(coeffs);
    }

    public double evaluate(double x) {
        double res = 0.0;
        for (int i = coeffs.length - 1; i >= 0; i--) {
            res += Math.pow(x, i) * coeffs[i];
        }
        return res;
    }

    public MyPolynomial add(MyPolynomial right) {
        int size = this.getDegree() > right.getDegree() ? this.getDegree() + 1 : right.getDegree() + 1;
        MyPolynomial newPolynomial = new MyPolynomial(new double[size]);
        for (int j = 0; j < size; j++) {
            newPolynomial.coeffs[j] = this.coeffs[j] + right.coeffs[j];
        }
        return newPolynomial;
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int size = this.getDegree() + right.getDegree() + 1;
        MyPolynomial newPolynomial = new MyPolynomial(new double[size]);
        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= right.getDegree(); j++)
                newPolynomial.coeffs[i + j] += this.coeffs[i] * right.coeffs[j];
        }
        return newPolynomial;
    }
}
