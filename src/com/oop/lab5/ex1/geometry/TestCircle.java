package com.oop.lab5.ex1.geometry;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1);

        Cylinder cylinder1 = new Cylinder(5, "blue", 7);
        System.out.println(cylinder1);

        Cylinder cylinder2 = new Cylinder(3, "yellow", 9);
        System.out.println(cylinder2);

        System.out.println(cylinder1.getArea()); // total surface area
        System.out.println(cylinder1.getCircumference());

        System.out.println(cylinder2.getLateralArea());
    }
}