package com.eazybytes.marvel.app;

import com.eazybytes.marvel.base.Vehicle;
import com.eazybytes.marvel.vehicle.Car;

public class TestMethodHiding {
    public static void main(String[] args) {

        Vehicle vehicle = new Car();
        Car car = new Car();

        Vehicle.start();
        vehicle.start();

        Car.start();
        car.start();




    }
}
