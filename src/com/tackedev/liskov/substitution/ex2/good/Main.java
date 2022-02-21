package com.tackedev.liskov.substitution.ex2.good;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square(2d);
        square.getArea();

        Shape rectangle = new Rectangle(4d, 7d);
        rectangle.getArea();
    }
}
