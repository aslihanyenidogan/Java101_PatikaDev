import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizi Eleman Sayısını Giriniz :");
        int length = input.nextInt();
        int[] list1 = new int[length];

        System.out.println("Dizinin Elemanlarını Giriniz:");

        for (int i = 0; i < list1.length; i++) {
            System.out.print((i + 1) + ".Eleman :");
            list1[i] = input.nextInt();
        }
        
        System.out.println("Girilen Dizi :" + Arrays.toString(list1));
        Arrays.sort(list1);
        System.out.println("Sıralanan Dizi   :");
        System.out.println(Arrays.toString(list1));
        input.close();
    }
}
