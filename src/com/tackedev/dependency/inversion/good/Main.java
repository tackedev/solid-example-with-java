package com.tackedev.dependency.inversion.good;

public class Main {
    public static void main(String[] args) {
        Engine petrolEngine = new PetrolEngine();
        Car car = new Car();
        car.registerEngine(petrolEngine);
    }
}
