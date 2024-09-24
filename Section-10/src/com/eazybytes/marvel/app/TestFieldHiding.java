package com.eazybytes.marvel.app;

import com.eazybytes.marvel.base.Vehicle;
import com.eazybytes.marvel.vehicle.Car;

public class TestFieldHiding {
    public static void main(String[] args) {
        Car car=new Car();
        System.out.println(car.color);
        System.out.println(car.horsePower);
        System.out.println(car.turningradius);
        System.out.println(car.isAutomatic);

        Vehicle vehicle=car;
        System.out.println(vehicle.color);
        System.out.println(vehicle.horsePower);
        System.out.println(vehicle.turningradius);
    }
}
