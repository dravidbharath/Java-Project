package com.eazybytes.marvel.hero;

public interface Superhero {

     String UNIVERSE_NAME ="Marvel";

/*
* if 'Y', Kill the villain
*if 'N' , stop the villain
* @param c indicates Y or N
* */
     String usePower();// Abstract method
     String stopVillain(char c);

     default String trackLiveLocation(){
          String liveLocation = "USA";
          System.out.println("I am in" + liveLocation);
          return liveLocation;
     };

     static String commonCharacteristics() {
          return "Superhuman abilities,willingness to sacrifice";
     }

}
