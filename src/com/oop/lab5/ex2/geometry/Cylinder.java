package com.oop.lab5.ex2.geometry;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder() {
        this.base = new Circle();
        this.height = 1.0;
    }

    public Cylinder(double radius) {
        this.base = new Circle(radius);
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        this.base = new Circle(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        this.base = new Circle(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getCircumference() {
        return base.getCircumference();
    }

    public double getTotalArea() {
        return 2 * base.getArea() + base.getCircumference() * this.height; // Total surface area: 2 * pi * r * h + 2 * pi * r^2
    }

    public double getLateralArea() {
        return base.getCircumference() * this.height; // Lateral surface area: 2 * pi * r * h
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + ", height = " + this.height;
    }
}
