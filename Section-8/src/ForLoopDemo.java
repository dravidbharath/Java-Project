public class ForLoopDemo {
    public static void main(String[] args) {
        int result;
        for (int i=1; i<=10; i++) {
             result = i*5;
            System.out.println("5*" + i + "=" + result);

//            Infinite for loop
            for (;;) {
                System.out.println("Infinite loop");
            }

        }
    }
}
