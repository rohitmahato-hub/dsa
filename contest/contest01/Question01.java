import java.util.Arrays;
public class Question01 {
   public static void main(String[] args) {
      int nums[] ={1,2,3,4};
      int[] ans = countOppositeParity(nums);
      System.out.println(Arrays.toString(ans));
   } 
   public static int[] countOppositeParity(int[] nums) {
        // int[] res = new int[nums.length];
        // for(int i = 0; i<nums.length;i++){
        //     for(int j = i+1; j< nums.length; j++){
        //         if(nums[i]%2 != nums[j]%2){
        //             res[i]++;
        //         }
        //     }
        // }
        // return res;   this is brute force

        int[] res = new int[nums.length];
        int evenCount = 0;
        int oddCount = 0;
        for(int i = nums.length-1; i>=0; i--){
            if(nums[i] % 2 == 0){
                res[i] = oddCount;
                evenCount++;
            }else{
                res[i] = evenCount;
                oddCount++;
            }
        }
        return res;
    }
}
