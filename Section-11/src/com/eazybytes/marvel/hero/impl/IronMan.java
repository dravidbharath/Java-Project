package com.eazybytes.marvel.hero.impl;

import com.eazybytes.marvel.hero.Superhero;

public  class IronMan implements Superhero {
    @Override
    public String usePower() {
        return "Ironman using his power";
    }

    @Override
    public String stopVillain(char c) {
        if(c=='Y') {
            return "Ironman killed the villain";
        } else {
            return "Ironman stopped the villain";
        }
    }
}
