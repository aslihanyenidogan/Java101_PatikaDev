import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armutKg,elmaKg,domatesKg,muzKg,palicanKg,total,p,a,t,b,e;
        Scanner inp=new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        armutKg= inp.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        elmaKg= inp.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        domatesKg= inp.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        muzKg= inp.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ?: ");
        palicanKg= inp.nextDouble();

        p=armutKg*2.14;
        a=elmaKg*3.67;
        t=domatesKg*1.11;
        b=muzKg*0.95;
        e=palicanKg*5.00;

        total=p+a+t+b+e;

        System.out.println("Toplam: "+total+" TL");
    }
}