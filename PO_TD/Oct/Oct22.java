public class Oct22 {
   public static void main(String[] args) {
     int[] nums = {0,2,1};
     System.out.println(Oct22.minOperations(nums));
   }
    public static int minOperations(int[] nums) {
        int n = nums.length;
        int zeroIndex = -1;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zeroIndex = i;
                break;
            }
        }
        boolean isIncreasing = true;
        for (int j = 0; j < n; j++) {
            if (nums[(zeroIndex + j) % n] != j) {
                isIncreasing = false;
                break;
            }
        }
        boolean isDecreasing = true;
        for (int j = 0; j < n; j++) {
            if (nums[(zeroIndex - j + n) % n] != j) {
                isDecreasing = false;
                break;
            }
        }

        int minOps = Integer.MAX_VALUE;

        if (isIncreasing) {
            if (zeroIndex == 0) return 0; 
            minOps = Math.min(minOps, Math.min(zeroIndex, n - zeroIndex + 2));
        }

        if (isDecreasing) {
            minOps = Math.min(minOps, Math.min(n - zeroIndex, zeroIndex + 2));
        }

        return minOps == Integer.MAX_VALUE ? -1 : minOps;
    }
}
