package com.eazybytes.marvel.base;

public class Person {

    //using protected below because we want only our child classes to use the below fields

    protected String name;
    protected int age;

    public void eat( String food) {
        System.out.println("Person is eating " + food);
    }

    public void walk() {
        System.out.println("Person is walking");
    }
    public void sleep() {
        System.out.println("Person is sleeping");
    }


}
