public class Question13 {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
         int res = missingNumber(nums);
        System.out.print(res);
    }
    public static int missingNumber(int[] nums) {
        int temp = 0;
        for(int i = 0;i<=nums.length;i++){
            temp = temp^i;
        }
        for(int i =0; i<nums.length;i++){
            int num = nums[i];
            temp = temp^num;
        }
        return temp;
    }
}
