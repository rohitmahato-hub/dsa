public class Aug02 {
    public static void main(String[] args) {
        int[]  piles = {5,3,4,5};
        boolean res = stoneGame(piles);
        System.out.println(res);
    }
    public static  boolean stoneGame(int[] piles) {
        // Alice can always force a win by choosing either all even or all odd indexed piles.
        return true;
    }


//public boolean stoneGame(int[] piles) {
//         int n = piles.length;
//         int[][] dp = new int[n][n];
        
//         for (int i = 0; i < n; i++) {
//             dp[i][i] = piles[i];
//         }
        
//         for (int d = 1; d < n; d++) {
//             for (int i = 0; i < n - d; i++) {
//                 int j = i + d;
                
//                 dp[i][j] = Math.max(piles[i] - dp[i + 1][j], piles[j] - dp[i][j - 1]);
//             }
//         }
        
//         return dp[0][n - 1] > 0;
//     }
}
