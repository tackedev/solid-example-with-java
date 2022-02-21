package com.tackedev.dependency.inversion.good;

public class Car {
    private Engine engine;

    public Car() {
    }

    public void run() {
        engine.run();
    }

    public void registerEngine(Engine engine) {
        this.engine = engine;
    }
}
