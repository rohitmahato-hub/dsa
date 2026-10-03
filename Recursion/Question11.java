public class Question11 {
    public static void main(String args[]){
         int n = 4;
         System.out.println(new Question11().countGoodNumbers(n));
    }
    public static int countGoodNumbers(long n) {
       long MOD = 1000000007;
       long oddCount = n/2;
       long evenCount = (n+1)/2;

       long evenResult = pow(5, evenCount,MOD);
       long oddResult = pow(4,oddCount,MOD);

       long totalWays = (evenResult * oddResult) % MOD;
       return (int) totalWays; 
    }
    private static long pow(long base, long exp, long mod){
        long result = 1;
        base %= mod;
        while(exp > 0){
            if(exp % 2 == 1){
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp = exp/2;
        }
        return result;
    }
}
