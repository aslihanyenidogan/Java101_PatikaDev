import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenleri oluştur
        int mat,fizik,kimya,turkce,tarih,muzik;

        //Scanner sınıfımız tanımaldık
        Scanner inp=new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz : ");
        mat=inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik=inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya=inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce=inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih=inp.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik=inp.nextInt();

        int toplam=(mat+fizik+kimya+turkce+tarih+muzik);
        double ort=toplam/6.0;
        System.out.println("Ortalamanız : " +ort);

        String sonuc = ort >= 60 ? "sınıfı geçti" : "sınıftan kaldı";

        System.out.println("Öğrencinin derslerinin ortalaması: " + ort + "\nÖğrenci " + sonuc + ".");





    }

}