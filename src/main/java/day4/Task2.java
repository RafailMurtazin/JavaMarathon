package day4;

import java.util.Scanner;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr = scanner.nextInt();

        Random random = new Random();
        random.nextInt(100);

        int[] array = new int[arr];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }

        int max = array[0];
        int min = array[0];

        for (int a : array) {
            if (a > max) {
                max = a;
            }
            if (a < min) {
                min = a;
            }
        }
        System.out.println("Minimum array element: " + min + '\n' + "Maximum array element: " + max);

        int endZero = 0;
        for (int z : array) {
            if (z % 10 == 0) {
                endZero++;
            }
        }

        System.out.println("number of array elements ending in 0: " + endZero);

        int sumEndZero = 0;
        for (int s : array) {
            if (s % 10 == 0) {
                sumEndZero += s;
            }
        }
        System.out.println("Sum of array elements ending in 0: " + sumEndZero);


    }
}
