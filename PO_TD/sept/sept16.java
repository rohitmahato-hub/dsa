public class sept16 {
    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        int res = numberOfSets(n,k);
        System.out.println(res);
    }
    public static final long MOD = 1_000_000_007;

    public static int numberOfSets(int n, int k) {
        int total = n + k - 1;
        int choose = 2 * k;

        long[] fact = new long[total + 1];
        long[] invFact = new long[total + 1];

        fact[0] = 1;

        for (int i = 1; i <= total; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }

        invFact[total] = power(fact[total], MOD - 2);

        for (int i = total; i > 0; i--) {
            invFact[i - 1] = invFact[i] * i % MOD;
        }

        return (int) (fact[total]
                * invFact[choose] % MOD
                * invFact[total - choose] % MOD);
    }

    private static long power(long a, long b) {
        long result = 1;

        while (b > 0) {
            if ((b & 1) == 1) {
                result = result * a % MOD;
            }

            a = a * a % MOD;
            b >>= 1;
        }

        return result;
    }
}
