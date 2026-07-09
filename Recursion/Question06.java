public class Question06 {
    public static void main(String []args){
        int m = 3;
        int n = 7;
        int res = uniquePaths(m,n);
        System.out.println(res);
    }
    public static int uniquePaths(int m, int n) {
        int[][] memo = new int[m + 1][n + 1];
        return findPaths(m, n, memo);
    }
    
    private static int findPaths(int m, int n, int[][] memo) {
        if (m == 1 || n == 1) {
            return 1;
        }
        if (memo[m][n] > 0) {
            return memo[m][n];
        }
        memo[m][n] = findPaths(m - 1, n, memo) + findPaths(m, n - 1, memo);
        return memo[m][n];
    }
}
