package com.oop.lab5.point;

import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        Point2D point2Da = new Point2D(3, 4);
        System.out.println(point2Da);

        Point3D point3Da = new Point3D(4, 5, 6);
        System.out.println(point3Da);

        // test getters and setters
        System.out.println(Arrays.toString(point2Da.getXY()));
        System.out.println(Arrays.toString(point3Da.getXYZ()));

        point2Da.setX(2.66f);
        point2Da.setY(3.73f);
        System.out.println(point2Da);

        point3Da.setXYZ(4.55f, 6.5f, 7.2f);
        System.out.println(point3Da);
    }
}
