public class AssignmentOperatorDemo {
    public static void main(String[] args) {
        int num1 , num2 , num3 , num4 , num5 , num6 ;
        num1 = num2 = num3 = num4 = num5 = num6 = 96 ;

        double dnum1 = 3.14;
        double dnum2 = 3.16;
        dnum1 = dnum2;
        System.out.println(dnum2);

        Person person1 = new Person("Bharath");
        Person person2 = new Person("Kumar");
        person1 = person2;
        System.out.println(person1.name);
        person2.name = "KUMAR";

    }
}
