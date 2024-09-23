import java.sql.SQLOutput;

public class InternMethodDemo {
    public static void main(String[] args) {
        String Hello="Hello";
        String obj = new String("Hello").intern();
        System.out.println(Hello==obj);

        String s1 = "Hello";
        String s2 = new String("Hello");
        System.out.println(s1==s2);
        String s3 = s2.intern();

    }
}
