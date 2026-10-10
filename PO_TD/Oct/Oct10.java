public class Oct10{
    public static void main(String[] args){
        int[] nums1 = {1,2,3,4};
        int [] nums2 = {2,10,20,19};
        int k1 = 1;
        int k2 = 1;
        System.out.println(Oct10.minSumSquareDiff(nums1,nums2,k1,k2));
    }
     public  static long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
      
        long k = (long) k1 + k2;
     
        int[] counts = new int[100001];
        int maxDiff = 0;
        
        for (int i = 0; i < nums1.length; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            if (diff > 0) {
                counts[diff]++;
                maxDiff = Math.max(maxDiff, diff);
            }
        }
    
        for (int i = maxDiff; i > 0 && k > 0; i--) {
            if (counts[i] > 0) {
                
                long shift = Math.min((long) counts[i], k);
                
                counts[i] -= shift;       
                counts[i - 1] += shift;  
                k -= shift;               
            }
        }
        long totalSum = 0;
        for (int i = 1; i <= maxDiff; i++) {
            if (counts[i] > 0) {
                totalSum += counts[i] * (long) i * (long) i;
            }
        }
        
        return totalSum;
    }
}