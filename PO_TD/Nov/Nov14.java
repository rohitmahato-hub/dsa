import java.util.List;

public class Nov14 {
    public static void main(String[] args){
        List<Integer> nums = List.of(3, -2, 1, 4);
        int l = 2;
        int r = 3;
        System.out.println(minimumSumSubarray(nums, l, r));
    }
     public static int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums.get(j);
                int len = j - i + 1;
                if (len >= l && len <= r && sum > 0) {
                    ans = Math.min(ans, sum);
                }
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
