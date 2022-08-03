public class Main{

    public static void main(String[] args) {

        int yuzler,onlar,birler,toplam;

        System.out.println("Armstrong Sayılar :");

        for(int i=100;i<1000;i++){

            yuzler=i/100;
            onlar=(i%100)/10;
            birler=i%10;

            toplam= (int) (Math.pow(yuzler,3)+Math.pow(onlar, 3)+Math.pow(birler, 3));

            if(i == toplam){

                System.out.print(i + " ");
            }

        }

    }

}
