package com.tackedev.dependency.inversion.good;

public class Car {
    private final Engine engine;

    public Car() {
        engine = new PetrolEngine();
    }

    public void run() {
        engine.run();
    }
}
