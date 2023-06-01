package org.koffa.uppgift2;

public class Circle implements Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double calculateCircumference() {
        return 2 * radius * Math.PI;
    }
}