import java.util.ArrayList;
import java.util.List;

public class Question09 {
    public static void main(String args[]){
        int[] nums = {1,2,3};
        System.out.println(new Question09().subsets(nums));
        
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        generateSubsets(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void generateSubsets(int index, int[] nums, List<Integer> currentBag, List<List<Integer>> result) {
      
        if (index == nums.length) {
            result.add(new ArrayList<>(currentBag));
            return;
        }
        currentBag.add(nums[index]);
       
        generateSubsets(index + 1, nums, currentBag, result); 
        currentBag.remove(currentBag.size() - 1);
        generateSubsets(index + 1, nums, currentBag, result); 
    }
}
