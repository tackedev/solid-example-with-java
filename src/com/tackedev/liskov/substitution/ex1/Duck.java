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

    public void walk() {
        System.out.println("Walk by 2 legs");
    }
}
