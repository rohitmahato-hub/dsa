// public class Question12 {
//     public static void main(String[] args) {
//         int arr[] = {-1,0,1,2,-1,-4};
        

//         for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//               for(int k=j+1;k<arr.length;k++){
//                 if(arr[i]+arr[j]+arr[k]==0){
//                   System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
//                 }
//               }
//            }
//         }
//     }
// }


// 2 pointer apporach......

import java.util.*;

public class Question12 {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        Question12 obj = new Question12();
        List<List<Integer>> result = obj.threeSum(nums);

        System.out.println(result);
    }

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;

                    j++;
                    k--;
                }
                else if (sum < 0) {
                    j++;
                }
                else {
                    k--;
                }
            }
        }
        return result;
    }
}
