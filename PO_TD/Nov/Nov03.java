public class Nov03 {
    public static void main(String[] args){
       int[] nums = {2,1,3};
       System.out.println(minMoves3(nums));
    }
    public static int minMoves3(int[] nums){
        int max = Integer.MIN_VALUE;
        int moves = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        for(int i = 0;i< nums.length;i++){
            moves += Math.abs(max - nums[i]);
        }
        return moves;
    }
}
