package day4;

public class Task2 {
    public static void main(String[] args) {
        int[][] array = new int[4][3];
        array[0] = new int[1];
        array[1] = new int[3];
        array[2] = new int[7];
        array[3] = new int[4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
//                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j] = j + i;
                    System.out.print(array[i][j] + " ");
                    if (j == array[i].length - 1)
                        System.out.println();
                }
            }

        }
    }
//}