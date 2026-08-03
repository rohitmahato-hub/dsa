public class Aug01 {
    public static void main(String[] args) {
       int[] nums = {1,5,2};
       boolean res = predictTheWinner(nums);
       System.out.println(res);
    }
    public static boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        
        for (int i = 0; i < n; i++) {
            dp[i] = nums[i];
        }
        
        for (int diff = 1; diff < n; diff++) {
            for (int i = 0; i < n - diff; i++) {
                int j = i + diff;
                dp[i] = Math.max(nums[i] - dp[i + 1], nums[j] - dp[i]);
            }
        }
        
        return dp[0] >= 0;
    }
}
