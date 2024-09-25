package com.eazybytes.marvel.hero.app;

import com.eazybytes.marvel.hero.Superhero;
import com.eazybytes.marvel.hero.impl.CaptainAmerica;
import com.eazybytes.marvel.hero.impl.IronMan;
import com.eazybytes.marvel.hero.impl.SpiderMan;

public class MarvelHeroDemo {
    public static void main(String[] args) {

        System.out.println(Superhero.UNIVERSE_NAME);

        Superhero ironMan = new IronMan();
        invokeSuperhero(ironMan);

        Superhero spiderMan = new SpiderMan();
        invokeSuperhero(spiderMan);

        Superhero captainAmerica = new CaptainAmerica();
        invokeSuperhero(captainAmerica);
    }

    private static void invokeSuperhero(Superhero superhero) {
        System.out.println(superhero.usePower());
        System.out.println(superhero.stopVillain('N'));

    }
}
