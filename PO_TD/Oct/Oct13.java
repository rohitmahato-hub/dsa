import java.util.Arrays;
public class Oct13 {
    public static void main(String[] args) {
        int[] nums = {1,-1,2,-2,3,-3};
        System.out.println(Oct13.maxAlternatingSum(nums));
    }
    public static long maxAlternatingSum(int[] nums){
        for(int i =0;i<nums.length;i++){
            (nums[i]) = Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        long maxScore = 0;
        int mid = nums.length / 2;

        for(int i =0;i<nums.length;i++){
            long squared = (long) nums[i] * nums[i];
            if(i<mid){
                maxScore -= squared;
            }else{
                maxScore += squared;
            }
        }
        return maxScore;
    }
}
