package com.oop.lab5.ex2.point;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub lineSub1 = new LineSub(3, 3, 8, 8);
        System.out.println(lineSub1);

        Point point1 = new Point(2, 2);
        Point point2 = new Point(5, 7);
        LineSub lineSub2 = new LineSub(point1, point2);
        System.out.println(lineSub2);

        // test getters and setters
        System.out.println(lineSub1.getBeginX());
        System.out.println(lineSub1.getBeginY());
        System.out.println(lineSub2.getBegin());

        lineSub2.setBeginXY(7,5);
        System.out.println(lineSub2);

        System.out.println(lineSub1.getLength());
        System.out.println(lineSub2.getLength());
        System.out.println(lineSub1.getGradient());
    }
}
