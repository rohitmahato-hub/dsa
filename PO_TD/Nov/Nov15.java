public class Nov15{
    public static void main(String[] args) {
       int[] arr = {1,3,5};
       System.out.println(numOfSubarrays(arr)); 
    }
    public static int numOfSubarrays(int[] arr) {
        int ans = 0;
        int MOD = 1000000007;
        int oddCount = 0;
        int evenCount = 1;
        long prefixSum = 0;
        for(int i = 0;i<arr.length;i++){
            prefixSum += arr[i];
            if(prefixSum % 2 == 0){
                ans = (ans + oddCount) % MOD;
                evenCount++;
            }else{
                ans = (ans + evenCount) % MOD;
                oddCount++;
            }
        }
        return ans;
    }
}