import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy, kilo;

        Scanner inp=new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz  : ");
        boy=inp.nextDouble();
        System.out.print("Lütfen kilonuzu (kg cinsinde) giriniz : ");
        kilo=inp.nextDouble();
        double vucutKitleEndeksi=kilo/(boy*boy);


        System.out.println("Vücut Kitle İndeksiniz : "+vucutKitleEndeksi);

    }
}