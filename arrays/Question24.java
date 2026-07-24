public class Question24 {
    public static void main(String[] args) {
       int[] nums = {4,1,2,1,2};
       int res = singleNumber(nums);
       System.out.println(res); 
    }
     public static int singleNumber(int[] nums) {
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            count ^= nums[i];
        }
        return count;
    }
}
