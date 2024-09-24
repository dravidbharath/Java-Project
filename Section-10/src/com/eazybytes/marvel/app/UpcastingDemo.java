package com.eazybytes.marvel.app;

import com.eazybytes.marvel.animals.Cat;
import com.eazybytes.marvel.animals.Dog;
import com.eazybytes.marvel.base.Animal;

public class UpcastingDemo {
    public static void main(String[] args) {
        Animal anm = new Animal();
        anm.setName("Scooby");
        AnimalUtilitty.printName(anm);
        anm.eat();

        anm = new Dog();
        anm.setName("charlie");
        System.out.println(anm.getName());
        anm.eat();

        Cat cat = new Cat();
        cat.setName("david");
        AnimalUtilitty.printName(cat);
    }
}
