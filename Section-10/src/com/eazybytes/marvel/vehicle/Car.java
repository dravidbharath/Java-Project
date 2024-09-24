package com.eazybytes.marvel.vehicle;

import com.eazybytes.marvel.base.Vehicle;

public class Car extends Vehicle {

    public int horsePower;
    public String color;
    public double turningradius;
    public boolean isAutomatic;

    public Car() {
        super("water");
        System.out.println("Inside Car default constructor");
        horsePower=10;
        color="black";
        turningradius=8.34;
        madeFor = "Road";
        isAutomatic=true;


    }
    public static void start() {
        System.out.println("Car Starting");
    }
}
