import java.util.HashSet;
import java.util.Set;

public class Oct16 {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Oct16.sumCounts(nums));
    }
    public static int sumCounts(int[] nums) {
        long totalSum = 0;
        int n = nums.length;
        long MOD = 1000000007;
        
        for (int i = 0; i < n; i++) {
            Set<Integer> distinctElements = new HashSet<>();
            
            for (int j = i; j < n; j++) {
                distinctElements.add(nums[j]);
                long distinctCount = distinctElements.size();
                totalSum = (totalSum + (distinctCount * distinctCount) % MOD) % MOD;
            }
        }
        
        return (int) totalSum;
    }
}
