package com.tackedev.dependency.inversion.good;

public class DieselCar {
    private Engine engine = new DieselEngine();

    public DieselCar() {
    }

    public void run() {
        engine.run();
    }
}
