package com.tackedev.liskov.substitution.ex1;

public abstract class Duck {

    protected int numberOfLegs = 2;
    protected String color;

    public Duck(String color) {
        this.color = color;
    }

    public void sound() {
        System.out.println("Quack quack!!!");
    }

    public abstract void walk();
}
