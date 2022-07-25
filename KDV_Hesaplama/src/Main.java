import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kdvOran=0.18;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz : ");
        double tutar=scan.nextDouble();

        if(tutar > 1000) {
            kdvOran = 0.08;
        }

        double kdvTutar=tutar*kdvOran;
        double kdvliTtutar=tutar+kdvTutar;

        System.out.println("KDV'siz Tutar :"+tutar);
        System.out.println("KDV Oranı : "+kdvOran);
        System.out.println("KDV Tutarı : "+kdvTutar);
        System.out.println("KDV'li Tutarı' : "+kdvliTtutar);

    }
}100