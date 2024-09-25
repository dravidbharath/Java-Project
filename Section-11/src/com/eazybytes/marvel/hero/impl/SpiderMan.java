package com.eazybytes.marvel.hero.impl;

import com.eazybytes.marvel.hero.Superhero;

public class SpiderMan implements Superhero {
    @Override
    public String usePower() {
        return "Spiderman using his power";
    }

    @Override
    public String stopVillain(char c) {
        if(c=='Y') {
            return "Spiderman killed the villain";
        } else {
            return "Spiderman stopped the villain";
        }
        };

    @Override
    public String trackLiveLocation(){
        String liveLocation = "USA";
        System.out.println("I am in" + liveLocation);
        return liveLocation;
    }

public static String commonCharacteristics() {
    return "Superhuman abilities,willingness to sacrifice";
}
}
