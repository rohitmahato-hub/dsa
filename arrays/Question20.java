public class Question20 {
    public static void main(String[] args) {
        int[] nums = {1,-3,2,3,-4};
        int res = maxAbsoluteSum(nums);
        System.out.println(res);
        
    }
    public static int maxAbsoluteSum(int[] nums) {

        int currMax = nums[0];
        int currMin = nums[0];

        int maxSum = nums[0];
        int minSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            currMax = Math.max(nums[i], currMax + nums[i]);
            currMin = Math.min(nums[i], currMin + nums[i]);

            maxSum = Math.max(maxSum, currMax);
            minSum = Math.min(minSum, currMin);
        }

        return Math.max(maxSum, Math.abs(minSum));
    }
}
