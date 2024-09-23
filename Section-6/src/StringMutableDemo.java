public class StringMutableDemo {
    public static void main(String[] args) {

        //Approach 1
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("World");
        strBuilder.insert(0,"Hello ");
        strBuilder.deleteCharAt(4);
        strBuilder.insert(4,'o');
        strBuilder.setLength(5);
        strBuilder.reverse();
       String str =  strBuilder.toString();

        //Approach 2
        StringBuffer strBuffer = new StringBuffer();
        strBuffer.append("World");
        strBuffer.insert(0,"Hello ");
        strBuffer.deleteCharAt(4);
        strBuffer.insert(4,'o');
        strBuffer.setLength(5);
        strBuffer.reverse();
        String str1 =  strBuffer.toString();

    }
}
