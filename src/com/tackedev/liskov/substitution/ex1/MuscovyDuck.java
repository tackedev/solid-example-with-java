package com.tackedev.liskov.substitution.ex1;

public class MuscovyDuck extends Duck {

    public MuscovyDuck() {
        super("black");
    }

    @Override
    public void walk() {
        System.out.println("Walk by 2 legs");
    }
}
