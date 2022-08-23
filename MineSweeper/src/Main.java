import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row, column;
        System.out.println("Welcome Mine Sweeper!");
        System.out.println("Please choose size");
        System.out.println("Row number: ");
        row = scan.nextInt();
        System.out.println("Column number: ");
        column = scan.nextInt();


        MineSweeper mine = new MineSweeper(row, column);
        mine.run();
    }


}