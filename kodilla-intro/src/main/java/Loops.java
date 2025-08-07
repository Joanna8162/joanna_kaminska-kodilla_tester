import java.util.Random;

public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        int wynik = getCountOfRandomNumber(30);
        System.out.println("Wynik losowań: " + wynik);

        String[] names = new String[] {"Zygfryd", "Gwidon", "Florentyna"};

        for (int i=0; i<names.length; i++){
            System.out.println(names[i]);
        }

        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }

        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[1] = 10;
        numbers[2] = 3;
        numbers[3] = 39;
        numbers[4] = 27;

        int sum = 0;

        for(int i = 0; i<numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Total: " + sum);

        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }


        }
    public static int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(10);
            sum = sum + temp;
            result++;
        }
        return result;
    }

    }
