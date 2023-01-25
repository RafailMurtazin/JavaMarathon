package day3;

import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int b = 0 ;

        while (b <= 5) {
            double doe = scanner.nextDouble();
            double del = scanner.nextDouble();
            b++;

            if (del == 0){
                System.out.println("Delenie na 0");
                continue;
            }

            System.out.println(doe / del);
        }

    }
}
