package day4;

import java.util.Random;
public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            random.nextInt(10_000);
        }

        int maxSum = 0;
        int indexMaxSum = 0;
        int sum = 0;
        for (int i = 0; i < array.length - 2; i++) {
            for (int j = i; j < i + 4; j ++ ) {
                sum += j;
            }

            if (sum > maxSum) {
                maxSum = sum;
                indexMaxSum = i;
            }
        }

        System.out.println(indexMaxSum);
    }
}
