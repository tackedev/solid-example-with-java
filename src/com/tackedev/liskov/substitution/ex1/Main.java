package com.tackedev.liskov.substitution.ex1;

public class Main {
    public static void main(String[] args) {
        Duck duck = new RubberDuck("Yellow");
        duck.walk();
    }
}
