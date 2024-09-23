public class TextBlockDemo {
    public static void main(String[] args) {
        String input = "Hello,My name is John \n" +
        "and I am 25 years old";
        System.out.println(input);

        String textBlock = """
                <html>
                <body>
                <p>Hello world</p>
                </body>
                </html>
                """;
        System.out.println(textBlock);
    }
}
