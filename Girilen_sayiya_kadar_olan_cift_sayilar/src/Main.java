import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k,adet=0,toplam=0;
        double ortalama;
        Scanner inp = new Scanner(System.in);

        System.out.println("Sayı Giriniz : ");
        k=inp.nextInt();

        for(int i=1; i<=k; i++){
            if(i% 3 == 0 && i% 4==0){
                toplam+=i;
                adet++;

            }
        }
        ortalama=toplam/(adet-1);
        System.out.println(ortalama);

    }
}