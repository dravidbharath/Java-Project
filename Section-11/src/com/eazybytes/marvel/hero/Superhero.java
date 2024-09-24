package com.eazybytes.marvel.hero;

public interface Superhero {

/*
* if 'Y', Kill the villain
*if 'N' , stop the villain
* @param c indicates Y or N
* */
     String usePower();// Abstract method
     String stopVillain(char c);

}
