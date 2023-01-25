package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arr = scanner.nextInt();

        Random random = new Random();
        random.nextInt(10);

        int[] array = new int[arr];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        for (int ar : array) {
            System.out.print(ar + " ");
        }
//        длинна массива:
        System.out.println();
        System.out.println("Array length: " + array.length);

//         Количестве чисел > 8
        int moreEight = 0;
        for (int a : array) {
            if (a > 8) {
                moreEight++;
            }
        }
        System.out.println("Numbers greater than 8: " + moreEight);

//        Количество чисел = 1
        int equalsOne = 1;
        for (int a : array) {
            if (a == 1) {
                equalsOne++;
            }
        }
        System.out.println("Numbers equal to 1: " + equalsOne);

//        Количество нечетных и четных чисел
        int notEven = 0;
        int even = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                even++;
            } else if (i % 2 != 0) {
                notEven++;
            }
        }
        System.out.println("Even numbers: " + even);
        System.out.println("Not even numbers: " + notEven);


//
        int sum = 0;
        for(int s : array) {
            sum += s;
        }
        System.out.println("Sum of all array elements: " + sum);
    }

}
