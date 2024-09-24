package com.eazybytes.marvel.app;

import com.eazybytes.marvel.heroes.IronMan;

public class StaticPolymorphism {
    public static void main(String[] args) {
        IronMan ironMan = new IronMan();
        ironMan.eat("Pasta");
        ironMan.eat("pasta",1);
    }
}
