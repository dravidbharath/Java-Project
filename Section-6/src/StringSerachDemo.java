public class StringSerachDemo {
    public static void main(String[] args) {
        String originalString = "Hello World!";
        int index = originalString.indexOf('!');
        int index1 = originalString.indexOf("World");

        boolean isContains = originalString.startsWith("Hello");
        boolean isContains1 = originalString.endsWith("wefd");

        boolean isMatched = originalString.matches(".*World.*");
    }
}
