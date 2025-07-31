public class LeapYear {
    public static void main(String[] args) {

        int year = 2025;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + ": to rok przestępny");
        } else {
            System.out.println(year + ": to nie jest rok przestępny");
        }
    }
}