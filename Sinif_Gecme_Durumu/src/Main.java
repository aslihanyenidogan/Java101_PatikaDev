import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuz : ");
        mat=input.nextInt();

        System.out.println("Fizik notunuz : ");
        fizik=input.nextInt();

        System.out.println("Türkçe notunuz : ");
        turkce=input.nextInt();

        System.out.println("Kimya notunuz : ");
        kimya=input.nextInt();

        System.out.println("Müzik notunuz : ");
        muzik=input.nextInt();

        if (mat <= 0 || mat >= 100)
            mat = 0;
        if (fizik <= 0 || fizik >= 100)
            fizik = 0;
        if (kimya <= 0 || kimya >= 100)
            kimya = 0;
        if (turkce <= 0 || turkce >= 100)
            turkce = 0;
        if (muzik <= 0 || muzik >= 100)
            muzik = 0;

        double average = (mat+fizik+turkce+kimya+muzik)/5;
        if(average<=55){
            System.out.println("Sınıfta kaldınız!");
        }else{
            System.out.println("Sınıfı geçtiniz!");
        }

        System.out.println("Ortalamanız :"+average);

    }
}