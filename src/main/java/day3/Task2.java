package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double del = scanner.nextDouble();
            double doe = scanner.nextDouble();

            if (doe == 0)
                break;
            System.out.println(del / doe);

        }
    }
}
