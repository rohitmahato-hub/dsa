public class Sept24 {
    public static void main(String[] args) {
       int[] nums = {1,3,2};
       int res = smallestIndex(nums);
       System.out.println(res);
    }
     public static  int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (getDigitSum(nums[i]) == i) {
                return i; 
            }
        }
        return -1;
    }

    private static int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
