import java.util.Scanner;

class ColorNames {

    public static String getUserLetter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select a letter: (B-Black, G-Green, O-Orange, P-Pink, R-Red, W-White, Y-Yellow)");
            String letterOfColor = scanner.nextLine().trim().toUpperCase();

            if (letterOfColor.length() != 1) {
                System.out.println("Try again.");
                continue;
            }
                switch (letterOfColor) {
                    case "B":
                        return "Black";
                    case "G":
                        return "Green";
                    case "O":
                        return "Orange";
                    case "P":
                        return "Pink";
                    case "R":
                        return "Red";
                    case "W":
                        return "White";
                    case "Y":
                        return "Yellow";
                    default:
                        System.out.println("Wrong letter. Try again.");
            }
        }
    }
}

    public class Colors {
        public static void main(String[] args) {
            String result = ColorNames.getUserLetter();
            System.out.println("The full name of color is: " + result);
        }
    }