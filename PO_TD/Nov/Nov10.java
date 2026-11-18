public class Nov10 {
    public static void main(String[] args) {
        int n = 4;
        int[] costs = {1,2,3,4};
        System.out.println(climbStairs(n, costs));
    }
    public static int climbStairs(int n, int[] costs) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        
        for (int i = 1; i <= n; i++) {
            int currentStepCost = costs[i - 1]; 
            int minCost = dp[i - 1] + currentStepCost + 1;
            if (i >= 2) {
                int jump2 = dp[i - 2] + currentStepCost + 4;
                minCost = Math.min(minCost, jump2);
            }
            if (i >= 3) {
                int jump3 = dp[i - 3] + currentStepCost + 9;
                minCost = Math.min(minCost, jump3);
            }
            dp[i] = minCost;
        }
        
        return dp[n];
    }
}
