public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        double harAve;
        float sum = 0;
        for (int i : array) {
            sum += 1f / i;
        }
        harAve= array.length / sum;

        System.out.println("Harmonic Average = " + harAve);
    }
}