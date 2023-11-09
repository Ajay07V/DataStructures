package FreshPractice;

public class Factors {
    public static void main(String[] args) {
        int k = 12;
        int factorsCount = getNumberOfFactors(k);
        System.out.println(factorsCount);
    }

    private static int getNumberOfFactors(int k) {
        int count = 0;
        for (int i = 1; i < Math.sqrt(k); i++) {
            if (k % i == 0) {
                //i!=k/i not sure got from scaler notes source
                if (i == k / i) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }
}
