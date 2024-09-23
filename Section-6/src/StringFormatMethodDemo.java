public class StringFormatMethodDemo {
    public static void main(String[] args) {
        String message = "Hi %S! You have %d messages";
        String msgForBharath = String.format(message, "Bharath", 3);
        String msgForVijay = String.format(message, "Vijay", 15);

        String message1 = "The price is $%.2f";
        String price1 = String.format(message1, 45.2);

        String message2 = "The number is %2d";
        String number1 = String.format(message2, 5);
        String number2 = String.format(message2, 9);
        String number3 = String.format(message2, 11);

        String message3="My name is %s. I am %d years old and I live in %s";
        String result = String.format(message3, "Bharath", 25, "Chennai");

        String message4 = "My name is %s. I am %d years old and I live in %s";
        String result1 = String.format(message4, "Bharath", 25, "Chennai");
        System.out.println(result);
    }
}
