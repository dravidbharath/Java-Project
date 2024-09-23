public class StringConcatinationDemo {
    public static void main(String[] args) {
        int num1 =4;
        int num2 =6;
        String s1 = "Goals";

        String output = num1 + num2 + s1;

        boolean b = false;
        output = b + (num1 + num2 + s1);

        String s2 = null;
        String s3 = 6 + s2;
        String s4 = "Goals" + s2;
    }
}
