public class ConcatMethodDemo {
    public static void main(String[] args) {
        String hello = "Hello";
       hello = hello+" world";
        System.out.println(hello);

        String hello1 = "Hello";
        hello1 = hello1.concat(" world");
        System.out.println(hello1);

        String nullString = null;
        String emptystring="";
    }
}
