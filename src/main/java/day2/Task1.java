package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floor = scanner.nextInt();

        if (floor >= 1 && floor <= 4) {
            System.out.println("Lowe-rise building");
        } else if (floor >= 5 && floor <= 8) {
            System.out.println("Mide-rise house");
        } else if(floor >= 9){
            System.out.println("Multi-storey building");
        }else {
            System.out.println("Input Error");
        }
    }
}

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("vvedite chto-nibud");
//        String string = scanner.nextLine();
//        System.out.println("vi vveli " + string);