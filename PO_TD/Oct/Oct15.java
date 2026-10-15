import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Oct15 {
    public static void main(String[] args) {
        int[] nums = {1,2,1}; 
        System.out.println(Oct15.sumCounts(nums));
    }
     public static int sumCounts(List<Integer> nums) {
        int totalSum = 0;
        int n = nums.size();
        
        for (int i = 0; i < n; i++) {
            Set<Integer> distinctElements = new HashSet<>();
            
            for (int j = i; j < n; j++) {
                distinctElements.add(nums.get(j));
                int distinctCount = distinctElements.size();
                totalSum += distinctCount * distinctCount;
            }
        }
        
        return totalSum;
    }

    public static int sumCounts(int[] nums) {
        List<Integer> values = new ArrayList<>();
        for (int num : nums) {
            values.add(num);
        }
        return sumCounts(values);
    }
}
