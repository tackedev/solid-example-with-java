package com.tackedev.dependency.inversion.bad;

public class Car {
    private final PetrolEngine engine;

    public Car() {
        engine = new PetrolEngine();
    }

    public void run() {
        engine.run();
    }
}
