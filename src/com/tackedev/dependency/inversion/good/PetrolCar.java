package com.tackedev.dependency.inversion.good;

public class PetrolCar {
    private Engine engine;

    public PetrolCar() {
        this.engine = new PetrolEngine();
    }

    public void run() {
        engine.run();
    }
}
