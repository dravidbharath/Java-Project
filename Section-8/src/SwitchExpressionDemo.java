public class SwitchExpressionDemo {
    public static void main(String[] args) {
        String fruitName = "Banana";

        switch (fruitName) {

            case "Banana", "Apple" -> System.out.println("$1.5 charged");
            case "Grapes" -> System.out.println("$1.7 charged");
            case "Pineapple" -> System.out.println("$2.0 charged");
            case "Mango" -> System.out.println("$3.0 charged");
            default -> System.out.println("Invalid fruit name");
        }


            String output = switch (fruitName) {

                case "Banana", "Apple" -> "$1.5 charged";
                case "Grapes" -> "$1.7 charged";
                case "Pineapple" -> "$2.0 charged";
                case "Mango" -> "$3.0 charged";
                default -> "Invalid fruit name";
            };






            }
    }
