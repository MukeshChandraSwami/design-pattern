package com.learn;

public class ElectricCar implements ElectricalVehicle {
    @Override
    public void chargeBattery() {
        System.out.println("Charging battery of electric car");
    }

    @Override
    public void speed() {
        System.out.println("Speeding up electric car");
    }
}
