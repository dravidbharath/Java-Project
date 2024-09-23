public class PalindromeDemo{
    public static void main(String[] args) {
        String input = "mom";
        StringBuilder palindrome = new StringBuilder(input);
        palindrome.reverse();
        String reversed = palindrome.toString();
        boolean finalResult = input.equals(reversed);
        System.out.println(finalResult);
    }
}
