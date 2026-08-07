public class Aug06 {
    public static void main(String[] args) {
       int n = 10;
       int t = 2;
       int res = smallestNumber(n,t);
       System.out.println(res); 
    }
    public static int smallestNumber(int n, int t) {

        while (true) {

            if (isValid(n, t)) {
                return n;
            }

            n++;
        }
    }

    private static boolean isValid(int num, int t) {

        int product = 1;

        while (num > 0) {

            int digit = num % 10;

            product *= digit;

            num /= 10;
        }

        return product % t == 0;
    }
}
