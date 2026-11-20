import java.util.Arrays;

public class Nov20 {
    public static void main(String[] args) {
      int[] nums = {2,1,5,1,1};
      System.out.println(maxSelectedElements(nums)); 
    }
    public static int maxSelectedElements(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int mx = nums[n - 1];
        int[] dp = new int[mx + 2];
        int ans = 1;
        for (int x : nums) {
            dp[x + 1] = dp[x] + 1;
            dp[x] = dp[x - 1] + 1;
            ans = Math.max(ans, Math.max(dp[x], dp[x + 1]));
        }
        return ans;
    }
}
