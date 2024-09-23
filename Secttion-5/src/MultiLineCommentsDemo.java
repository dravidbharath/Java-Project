public class MultiLineCommentsDemo {

    /*
    Example of multiline comment
    jkbckjdbkjb
    vcadvadv
     */
    static final int MAX_RETRY_ATTEMPTS = 3;
    public static void main(String[] args) {
        MultiLineCommentsDemo obj = new MultiLineCommentsDemo();
        double totalArea=obj.calculateRectangleArea(24.5,34.6);
        System.out.println(totalArea);

    }

    /*

     */
    public double calculateRectangleArea (double length, double width) {
        double result=length * width;
        return result;
    }
}
