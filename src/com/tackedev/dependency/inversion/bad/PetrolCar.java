package com.tackedev.dependency.inversion.bad;

public class PetrolCar {
    private final PetrolEngine engine;

    public PetrolCar() {
        engine = new PetrolEngine();
    }

    public void run() {
        engine.run();
    }
}
