package com.tackedev.liskov.substitution.ex1;

public class RubberDuck extends Duck {

    public RubberDuck(String color) {
        super(color);
        this.numberOfLegs = 0;
    }

    @Override
    public void sound() {
        System.out.println("Chip chip!!!");
    }

    @Override
    public void walk() {
        throw new UnsupportedOperationException("Tao không biết đi, được không!");
    }
}
