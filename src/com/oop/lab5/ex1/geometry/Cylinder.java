package com.oop.lab5.ex1.geometry;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double radius) {
        super(radius);
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return 2 * super.getArea() + this.getCircumference() * this.height; // Total surface area: 2 * pi * r * h + 2 * pi * r^2
    }

    public double getLateralArea() {
        return this.getCircumference() * this.height; // Lateral surface area: 2 * pi * r * h
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + ", height = " + this.height;
    }
}
