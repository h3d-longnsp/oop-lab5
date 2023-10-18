package com.oop.lab5.ex2.point;

public class TestPoint {
    public static void main(String[] args) {
        Point point1 = new Point(5, 15);
        System.out.println(point1);

        point1.setX(6);
        point1.setXY(100, 10);
        System.out.println(point1);
    }
}
