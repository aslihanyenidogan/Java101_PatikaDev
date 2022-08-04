public class Main {
    public static void main(String[] args) {


        String primeNumber = "";
        for (int i = 1; i <= 100; i++) {
            int count = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    count ++;
                }
            }
            if (count == 2) {
                primeNumber = primeNumber + i + " ";
            }
        }
        System.out.println(primeNumber);
    }
}