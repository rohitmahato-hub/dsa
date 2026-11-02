import java.util.Arrays;
public class Nov02 {
    public static void main(String[] args) {
       int nums[] = {1,2,3};
       System.out.println(minMoves2(nums)); 
    }
    public static int minMoves2(int[] nums){
       Arrays.sort(nums);
       int median = nums[nums.length / 2];
       int moves = 0;
       for(int i = 0;i<nums.length;i++){
        moves += Math.abs(nums[i] - median);
       }
       return (int) moves;
    }
}
