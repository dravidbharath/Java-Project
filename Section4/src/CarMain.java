import java.sql.SQLOutput;

public class CarMain {

    static {
        System.out.println("static block from same class");
    }
    public static void main(String[] args) {
        System.out.println("Main method invocation started");
        Car car1 = new Car();
        Car car2 = new Car("Cameri","Black",220);
        System.out.println(Car.numberOfEngines);
        System.gc();

    }
}
