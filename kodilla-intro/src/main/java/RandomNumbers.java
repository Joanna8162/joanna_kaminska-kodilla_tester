import java.util.ArrayList;
import java.util.Random;

public class RandomNumbers {

    Random myRandom = new Random();
    ArrayList<Integer> numbers = new ArrayList<>();

    public void generate() {
        int sum = 0;
        while (sum <= 5000) {
            int number = myRandom.nextInt(31);
            numbers.add(number);
            sum += number;
        }
    }

    public int getMax() {
        int max = 0;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public int getMin() {
        int min = 31;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

}
