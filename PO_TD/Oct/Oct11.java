public class Oct11 {
    public static void main(String[] args) {
       int[] nums = {1,2,3,4};
       System.out.println(Oct11.squareOfSum(nums)); 
    }
    public  static int squareOfSum(int[] nums){
        int sum = 0;
        for(int i=1;i<=nums.length;i++){
            if(nums.length % i == 0){
                sum += nums[i-1] * nums[i-1];
            }
        }
        return sum;
    }
}
