package com.eazybytes.marvel.base;

import com.eazybytes.marvel.animals.Cat;
import com.eazybytes.marvel.animals.Dog;

public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println("Animal is eating");
    }

    public static void performAction(Animal animal) {
        animal.eat();
        if(animal instanceof Dog){
            Dog dog =(Dog) animal;
            dog.bark();
        }else if (animal instanceof Cat){
            Cat cat =(Cat) animal;
            cat.catSound();
        }
    }
}
