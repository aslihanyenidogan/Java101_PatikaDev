import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //C(n,r) = n! / (r! * (n-r)!)
        Scanner input = new Scanner(System.in);
        int n, r, comb, totaln = 1, totalr = 1, totalnr = 1;

        System.out.println("İlk degerini giriniz: ");
        n = input.nextInt();
        System.out.println("İkinci degeri giriniz: ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++){
            totaln = totaln * i;
        }

        for (int j = 1; j <= r; j++){
            totalr = totalr * j;
        }

        int minus = n - r;

        for (int k = 1; k <= minus; k++){
            totalnr = totalnr * k;
        }

        comb = (totaln / (totalr * totalnr));

        System.out.println("C(" + n + "," + r + ") = " + comb);

    }
}