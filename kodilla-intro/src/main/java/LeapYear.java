public class LeapYear {
    public static void main(String[] args) {

        int year = -1600;

        if (year >= 1582) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + ": to rok przestępny wg kalendarza gregoriańskiego");
            } else {
                System.out.println(year + ": to nie jest rok przestępny wg kalendarza gregoriańskiego");
            }
        } else if (year >= -45) {
            if (year % 4 == 0) {
            System.out.println(year + ": to rok przestępny wg kalendarza juliańskiego");
        } else {
            System.out.println(year + ": to nie jest rok przestępny wg kalendarza juliańskiego");
        }
    }
        else {
            System.out.println("Podano rok przed wprowadzeniem lat przestępnych");
        }
    }
}