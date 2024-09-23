public class StringReplaceDemo {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        String replacedString = originalString.replace("o", "*");
        String replacedString1 = originalString.replace("World","Universe");
        String replacedString2 = originalString.replace("world","Universe");

        String originalString1 = "qwqwqwqwqwqwq";
        String replacedString3 = originalString1.replace("qw","*");

        String originalString2 = "Java is fun!";
        String replacedString4 = originalString2.replaceAll("a|e|o|i|u","*");

        String originalString3 = "aa ss ss dd ff aa  gg";
        String replacedString5 = originalString3.replaceFirst("ss","&");
    }
}
