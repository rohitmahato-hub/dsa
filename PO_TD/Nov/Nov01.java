public class Nov01{
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(minMoves(nums));
    }
    public static int minMoves(int[] nums){
        int min = Integer.MAX_VALUE;
        int moves = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        for(int i = 0;i<nums.length;i++){
        moves += (nums[i] - min);
       }
       return moves;
    }
}