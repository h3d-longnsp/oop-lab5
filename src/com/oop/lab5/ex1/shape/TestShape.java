package com.oop.lab5.ex1.shape;

public class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println(shape1);

        Circle circle1 = new Circle();
        System.out.println(circle1);

        Rectangle rectangle1  = new Rectangle(4.5, 6);
        System.out.println(rectangle1);

        Square square1 = new Square("blue", false, 5);
        System.out.println(square1);

        // test setters and getters
        shape1.setColor("green");
        shape1.setFilled(false);
        System.out.println(shape1);

        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        circle1.setRadius(4.5);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());

        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());

        System.out.println(square1.getArea());
    }
}
