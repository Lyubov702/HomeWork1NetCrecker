package com.myExample.task2;

public class MyComplex {

    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "MyComplex{" +
                "(" + real +
                " + " + imag +
                "i)}";
    }

    public boolean isReal() {
        return this.real != 0.0;
    }

    public boolean isImaginary() {
        return this.imag != 0.0;
    }

    public boolean equals(double real, double imag) {
        if (this.real == real && this.imag == imag)
            return true;
        else
            return false;
    }

    public boolean equals(MyComplex another) {
        if (this.real == another.real
                && this.imag == another.imag)
            return true;
        else
            return false;
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2));
    }

    public double argument() {
        return Math.atan(imag / real);
    }

    public MyComplex add(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }

    public MyComplex subtract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(this.real - right.real, this.imag - right.imag);
    }

    public MyComplex multiply(MyComplex right) {
        this.real = this.real * right.real - this.imag * right.imag;
        this.imag = this.real * right.imag + right.real * this.imag;
        return this;
    }

    public MyComplex divide(MyComplex right) {
        this.real = (this.real * right.real + this.imag * right.imag)
                / (Math.pow(right.real, 2) + Math.pow(right.imag, 2));
        this.imag = (right.real * this.imag - this.real * right.imag)
                / (Math.pow(right.real, 2) + Math.pow(right.imag, 2));
        return this;
    }


    public MyComplex conjugate() {
        return new MyComplex(1 * real, -1 * imag);
    }


}
