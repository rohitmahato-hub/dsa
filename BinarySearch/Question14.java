public class Question14 {
    public static void main(String[] args) {
        int[]nums = {7,2,5,10,8};
        int k = 2;
        int res = splitArray(nums,k);
        System.out.println(res);
    }
    public static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for(int i = 0;i<nums.length;i++){
            start = Math.max(start,nums[i]);
            end += nums[i];
        }
        while(start <= end){
            int mid = start + (end-start)/2;
            if(canSplit(nums,k,mid)){
                end = mid -1;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
    private static boolean canSplit(int[] nums,int k,int target){
        int currentSum = 0;
        int splitRequired = 1;
        for(int i = 0;i<nums.length;i++){
            if(currentSum + nums[i] > target){
                currentSum = nums[i];
                splitRequired++;
                if(splitRequired > k){
                    return false;
                }
            }else{
                currentSum += nums[i];
            }
        }
        return true;
    }
}
