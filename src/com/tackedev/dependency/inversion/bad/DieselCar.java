package com.tackedev.dependency.inversion.bad;

public class DieselCar {
    private final DieselEngine engine;

    public DieselCar() {
        engine = new DieselEngine();
    }

    public void run() {
        engine.run();
    }
}
