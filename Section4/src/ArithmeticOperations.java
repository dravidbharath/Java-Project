public class ArithmeticOperations {

    double piValue=3.14;
    static final  double PI_VALUE=3.14;

    public static void main(String[] args) {
        ArithmeticOperations arithOperations=new ArithmeticOperations();
       int result =  arithOperations.sum(20,5);
        System.out.println(result);
        System.out.println(PI_VALUE);
        System.out.println(arithOperations.piValue);

    }
    public int sum(int num1,int num2) {
        subtract(num1,num2);
       int result= num1+num2;
       return result;


    }

    public int subtract(int num1,int num2) {

        int result= num1-num2;
        return result;


    }
    public static int addition(int num1,int num2) {
        int result= num1+num2;
        return result;
    }


}
