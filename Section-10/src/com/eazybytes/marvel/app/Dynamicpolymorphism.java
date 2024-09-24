package com.eazybytes.marvel.app;

import com.eazybytes.marvel.base.Person;
import com.eazybytes.marvel.heroes.IronMan;

public class Dynamicpolymorphism {
    public static void main(String[] args) {
        Person person=new IronMan();//upcasting
        person.walk(); //Ironman walk method is invoked
        person.eat("Icecream");

        IronMan ironMan=new IronMan();
        ironMan.callOverridenEatmethod();
    }

}
