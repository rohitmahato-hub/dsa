import java.util.Arrays;

public class Question07 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int res = rob(nums);
        System.out.println(res);
    }
    // public static int rob(int[] nums) {
    //     return solve(nums, 0);
    // }

    // private static int solve(int[] nums, int i) {

    //     if (i >= nums.length)
    //         return 0;

    //     int rob = nums[i] + solve(nums, i + 2);

    //     int skip = solve(nums, i + 1);

    //     return Math.max(rob, skip);
    // }

     public static  int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return solve(nums, 0, dp);
    }

    private static int solve(int[] nums, int i, int[] dp) {

        if (i >= nums.length)
            return 0;

        if (dp[i] != -1)
            return dp[i];

        int rob = nums[i] + solve(nums, i + 2, dp);
        int skip = solve(nums, i + 1, dp);

        dp[i] = Math.max(rob, skip);

        return dp[i];
    }
}
