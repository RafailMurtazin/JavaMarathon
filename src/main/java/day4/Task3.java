package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[12][8];

        Random random = new Random();

        int sum = 0;
        int maxSum = 0;
        int indxMaxSum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int f = 0; f < array[i].length; f++) {
                array[i][f] = random.nextInt(50);
                sum += array[i][f];
                if (sum >= maxSum) {
                    maxSum = sum;
                    indxMaxSum = i;
                }

            }

        }

        System.out.println(sum);
        System.out.println(maxSum);
        System.out.println(indxMaxSum);

    }
}

