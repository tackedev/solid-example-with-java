package com.tackedev.dependency.inversion.good;

public class Car {
    private final Engine engine;

    public Car() {
        this.engine = new PetrolEngine();
    }

    public void run() {
        engine.run();
    }
}
