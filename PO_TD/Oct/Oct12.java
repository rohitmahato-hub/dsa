import java.util.List;

public class Oct12 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(2, 6, 5, 8);
        int k =2;
        System.out.println(Oct12.maxSum(nums,k));
    }
    public static  int maxSum(List<Integer> nums, int k) {
        int MOD = 1_000_000_007;
        int[] bitCounts = new int[32];
        
        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                if ((num & (1 << i)) != 0) {
                    bitCounts[i]++;
                }
            }
        }
        
        long result = 0;
        
        for (int i = 0; i < k; i++) {
            long currentNum = 0;
            for (int j = 0; j < 32; j++) {
                if (bitCounts[j] > 0) {
                    currentNum |= (1L << j);
                    bitCounts[j]--;
                }
            }
            result = (result + (currentNum * currentNum) % MOD) % MOD;
        }
        
        return (int) result;
    }
}