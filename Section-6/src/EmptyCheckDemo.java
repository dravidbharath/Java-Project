public class EmptyCheckDemo {

    public static void main(String[] args) {

       String myString = "";
       boolean isEmpty = myString.isEmpty();
        boolean isLengthZero = myString.length()==0;
        boolean isEqualEmpty = "".equals(myString);

        String nullstring = null;
        boolean isnullEmpty = "".equals(nullstring);
        //boolean isEmptynull = nullstring.isEmpty();
       // boolean isLengthZeronull = nullstring.length()==0;
        String blankString = "      ";
        boolean isBlank = blankString.isEmpty();
        //boolean isLengthZeroBlank = blankString.length()==0;

    }
}
