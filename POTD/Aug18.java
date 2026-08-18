public class Aug18 {
    public static void main(String[] args) {
        int[] nums = {3,9,2,1,7};
        int k = 3;
        int res = largestInteger(nums,k);
        System.out.println(res);
    }
     public static int largestInteger(int[] nums, int k) {
        int n = nums.length;
        
        int[] freq = new int[51]; 
        for (int i = 0; i < n; i++) {
            freq[nums[i]]++;
        }
        
        int ans = -1;
        
        if (k == n) {
            for (int i = 0; i < n; i++) {
                ans = Math.max(ans, nums[i]);
            }
            return ans;
        }
        
        if (k == 1) {
            for (int i = 0; i < n; i++) {
                if (freq[nums[i]] == 1) { 
                    ans = Math.max(ans, nums[i]);
                }
            }
            return ans;
        }
        
        if (freq[nums[0]] == 1) {
            ans = Math.max(ans, nums[0]);
        }
        if (freq[nums[n - 1]] == 1) {
            ans = Math.max(ans, nums[n - 1]);
        }
        
        return ans;
    }
}
