package com.eazybytes.marvel.hero.impl;

import com.eazybytes.marvel.hero.Superhero;

public class CaptainAmerica implements Superhero {
    @Override
    public String usePower() {
        return "Captain America using his power";
    }

    @Override
    public String stopVillain(char c) {
        if(c=='Y') {
            return "Captain America killed the villain";
        } else {
            return "Captain America stopped the villain";
        }
    }
}
