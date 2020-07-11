package com.learn;

public class Car implements NormalVehicle {

    @Override
    public void addFuel() {
        System.out.println("Adding fuel in car");
    }

    @Override
    public void speed() {
        System.out.println("Speeding up car");
    }
}
