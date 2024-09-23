import java.sql.SQLOutput;

public class Car {
 String model;
 String color;
 int horsePower;
 static final byte NO_OF_WHEELS=4;
 static byte numberOfEngines;

    {/*
        this.model="camry";
        this.color="red";
        this.horsePower=200;*/
        System.out.println("Car object is being created");
    }

    static {
        numberOfEngines=1;
        System.out.println("Static block is being executed");
    }
    public Car() {
    }

    public Car(String model,String color,int horsePower) {
        this.model=model;
        this.horsePower=horsePower;
        this.color=color;
    }
 public void startCar() {
     System.out.println("Car started");
 }
 public String stopCar() {
     String output = "Car Stopped";
     return output;
 }

}
