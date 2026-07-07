public class Question04 {
    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;
        double res = myPow(x,n);
        System.out.println(res);
    }
    public static double myPow(double x, int n) {

        long power = n;

        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        return solve(x, power);
    }

    private static double solve(double x, long n) {

        if (n == 0)
            return 1;

        double half = solve(x, n / 2);

        if (n % 2 == 0)
            return half * half;

        return x * half * half;
    }
}
