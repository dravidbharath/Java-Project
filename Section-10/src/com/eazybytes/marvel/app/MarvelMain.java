package com.eazybytes.marvel.app;

import com.eazybytes.marvel.heroes.IronMan;

public class MarvelMain {
    public static void main(String[] args) {
        IronMan ironMan = new IronMan();
        ironMan.walk();
        ironMan.eat("Roti");
        ironMan.sleep();
        ironMan.usePower();
    }
}
