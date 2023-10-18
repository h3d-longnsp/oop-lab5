package com.oop.lab5.ex2.geometry;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder(5, 9);
        System.out.println(cylinder1);

        Cylinder cylinder2 = new Cylinder(3, "blue", 9);
        System.out.println(cylinder2);

        System.out.println(cylinder1.getCircumference());
        System.out.println(cylinder1.getTotalArea()); // total surface area

        System.out.println(cylinder2.getLateralArea());
    }
}
