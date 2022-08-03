import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı giriniz : ");

        int num = input.nextInt();

        int qty = 0,total=0;

        while(num != 0)
        {
            total +=  (num%10);
            num /= 10;
            ++qty;
        }
        System.out.println("basamak sayısı : " + qty);
        System.out.println("basamak toplamı: " + total);
    }


}