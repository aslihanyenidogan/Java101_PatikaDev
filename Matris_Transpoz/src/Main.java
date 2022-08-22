
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Line ?  ");
        int length = scan.nextInt();
        System.out.print("Column ?  ");
        int weight = scan.nextInt();
        System.out.println("Matrix element .");
        int[][] matrix = new int[length][weight];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = scan.nextInt();
        }
        System.out.println("Matrix : ");
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + "   ");
            System.out.println();
        }
        System.out.println("Matrix transpose : ");
        System.out.println();

        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
        scan.close();
    }
}