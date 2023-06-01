package org.koffa.uppgift2;

public class Rectangle implements Shape {
    double sideA;
    double sideB;
    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    @Override
    public double calculateCircumference() {
        return (sideA * sideA) + (sideB * sideB);
    }
}
