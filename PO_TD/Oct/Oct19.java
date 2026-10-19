import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Oct19{
    public static void main(String[] args) {
       int[] nums = {1,2,5,2,3};
       int target = 2;
       System.out.println(Oct19.targetIndices(nums, target)); 
    }
    public static  List<Integer> targetIndices(int[] nums, int target){
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == target){
                result.add(i);
            }
        }
        return result;
    }
}