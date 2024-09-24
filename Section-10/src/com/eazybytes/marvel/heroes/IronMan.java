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

    @Override
    public void eat( String food) {
        super.eat("pasta");
        System.out.println("Iron man is eating " + food);
    }

    private void eat(){
        System.out.println("Method overloading 1");
    }

    public void eat(String food,int quantity){
        System.out.println("Method overloading 2");
    }

    public void callOverridenEatmethod() {
        //super.eat("pasta");
        eat("pasta");
    }
}
