public class BinomialCoefficient{

    static long binomialCoefficient(int n, int r) {
        if (r < 0 || r > n) {
            return 0;
        }

        if (r > n - r) {
            r = n - r;
        }

        long result = 1;

        for (int i = 1; i <= r; i++) {
            result = result * (n - i + 1) / i;
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 2;

        System.out.println(binomialCoefficient(n, r));
    }
}