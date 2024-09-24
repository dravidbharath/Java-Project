package com.eazybytes.marvel.hero.app;

import com.eazybytes.marvel.hero.impl.CaptainAmerica;
import com.eazybytes.marvel.hero.impl.IronMan;
import com.eazybytes.marvel.hero.impl.SpiderMan;

public class MarvelHeroDemo {
    public static void main(String[] args) {
        IronMan ironMan = new IronMan();
        System.out.println(ironMan.usePower());
        System.out.println(ironMan.stopVillain('N'));

        SpiderMan spiderMan = new SpiderMan();
        System.out.println(spiderMan.usePower());
        System.out.println(spiderMan.stopVillain('Y'));

        CaptainAmerica captainAmerica = new CaptainAmerica();
        System.out.println(captainAmerica.usePower());
        System.out.println(captainAmerica.stopVillain('N'));
    }
}
