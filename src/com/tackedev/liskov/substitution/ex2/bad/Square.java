package com.tackedev.liskov.substitution.ex2.bad;

public class Square extends Rectangle {

    public Square(double height) {
        super(height, height);
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.setWeight(height);
    }

    @Override
    public void setWeight(double weight) {
        super.setWeight(weight);
        super.setHeight(weight);
    }

    @Override
    public double getArea() {
        return this.getHeight() * this.getHeight();
    }
}
