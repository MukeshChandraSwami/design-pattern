package com.learn;

public class Main {

    public static void main(String[] args) {
        NormalVehicle vehicle = new Car();
        vehicle.speed();
        vehicle.addFuel();

        ElectricalVehicle ev = new ElectricCar();
        ev.chargeBattery();
        ev.speed();
    }
}
