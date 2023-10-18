package com.oop.lab5.geometry;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1);

        Cylinder cylinder1 = new Cylinder(4, "blue", 5);
        System.out.println(cylinder1);

        System.out.println(cylinder1.getCircumference());
        System.out.println(cylinder1.getArea());
    }
}