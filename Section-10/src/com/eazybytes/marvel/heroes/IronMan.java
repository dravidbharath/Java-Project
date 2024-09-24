package com.eazybytes.marvel.heroes;

import com.eazybytes.marvel.base.Person;

public class IronMan extends Person {
    public void usePower() {
        System.out.println("IronMan is using his Power");
    }

    @Override
   public void walk() {
        System.out.println("Iron man walking with this suit");
    }
}
