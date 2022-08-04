import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, sum = 0;

        System.out.print("Sayı giriniz : ");
        n = scan.nextInt();

        for (int i = n - 1; i >= 1; i--) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {

            System.out.println(n + " mükemmel sayıdır.");
        } else {
            System.out.println(n + " mükemmel sayı değildir.");

        }
    }
}