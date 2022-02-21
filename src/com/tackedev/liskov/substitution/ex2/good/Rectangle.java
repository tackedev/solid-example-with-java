package com.tackedev.liskov.substitution.ex2.good;

public class Rectangle extends Shape {
    private double height;
    private double weight;

    public Rectangle(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public double getArea() {
        return this.height * this.weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
