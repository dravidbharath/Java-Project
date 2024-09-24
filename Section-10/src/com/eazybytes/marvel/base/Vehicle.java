package com.eazybytes.marvel.base;

public class Vehicle {

    Engine engine;
    public int horsePower;
    public String color;
    public double turningradius;
    public String madeFor;



    public Vehicle(String madeFor) {
        System.out.println("Inside vehicle default constructor");
        horsePower=120;
        color="white";
        turningradius=5.34;
        madeFor = "Road";
        this.madeFor = madeFor;


    }

    public static void start() {
        System.out.println("vehicle Starting");
    }

}
