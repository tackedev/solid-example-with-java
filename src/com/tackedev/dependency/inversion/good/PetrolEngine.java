package com.tackedev.dependency.inversion.good;

public class PetrolEngine extends Engine {
    @Override
    public void run() {
        System.out.println("Running by petrol...");
    }
}
