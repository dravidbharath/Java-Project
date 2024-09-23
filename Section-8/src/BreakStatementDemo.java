public class BreakStatementDemo {
    public static void main(String[] args) {
        // First part: break the loop when i == 5 and print i
        int i;
        for (i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
        }
        System.out.println("Value of i after the first loop: " + i);

        // Second part: Searching in array and breaking when found
        int[] arrayOfInt = {5646, 45, 4545, 45, 454, 44};
        int lookingFor = 455;
        boolean isFound = false;

        for (i = 0; i < arrayOfInt.length; i++) {
            if (arrayOfInt[i] == lookingFor) {
                isFound = true;
                break;
            }
        }

        if (isFound) {
            System.out.println("Element " + lookingFor + " found at index " + i);
        } else {
            System.out.println("Element " + lookingFor + " not found in the array.");
        }
    }
}
