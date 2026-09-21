import java.util.HashMap;
import java.util.Map;

public class Sept21 {
    public static void main(String[] args) {
      int[]  nums = {1,2,3,4,5};
      int k = 3;
      long[] res = resultArray(nums, k);
      for (long count : res) {
          System.out.print(count + " ");
      }
    }
    public static long[] resultArray(int[] nums, int k) {
        long[] result = new long[k];
       
        Map<Integer, Long> currentDp = new HashMap<>();
        
        for (int num : nums) {
            Map<Integer, Long> nextDp = new HashMap<>();
            int numMod = num % k;
            
            nextDp.put(numMod, 1L);
            
            for (Map.Entry<Integer, Long> entry : currentDp.entrySet()) {
                int val = entry.getKey();
                long count = entry.getValue();
                
                int newVal = (int) (((long) val * numMod) % k);
                nextDp.put(newVal, nextDp.getOrDefault(newVal, 0L) + count);
            }
            
            for (Map.Entry<Integer, Long> entry : nextDp.entrySet()) {
                int val = entry.getKey();
                long count = entry.getValue();
                result[val] += count;
            }
            
            currentDp = nextDp;
        }
        
        return result;
    }
}
