package day4;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int ar : array) {
            System.out.print(ar + " ");
        }
//        длинна массива:
        System.out.println();
        System.out.println("Array length : " + array.length);

//         Количестве чисел > 8
        int more = 0;
        for (int a : array) {
            if (a > 8) {
                more = a;
            }
        }
        System.out.println("Numbers greater than 8: " + more);

//        Количестве чисел = 1
        int one = 1;
        for (int a : array) {
            if (a == 1) {
                one = a;
            }
        }
        System.out.println("Numbers equal to 1: ");

//        Количество нечетных чисел
        int notEven = 0;
        int even = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                even = i;
            } else {
                notEven = i;

            }
        }
        System.out.println("Even numbers: " + even);
        System.out.println("Not even numbers: " + notEven);

        int sum = 0;
        for(int s : array) {
            sum = sum + s;
        }
        System.out.println("Sum of all array elements: " + sum);
    }










    public static void mixMax(double[] array) {
        double max = array[0];
        double min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Minimalnii element:  " + min + " Maximalnii element: " + max);
    }
}
