package com.tackedev.dependency.inversion.good;

public class DieselEngine extends Engine {
    @Override
    public void run() {
        System.out.println("Running by diesel...");
    }
}