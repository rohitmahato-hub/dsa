import java.util.ArrayList;
import java.util.List;

public class Aug04 {
    public static void main(String[] args){
        int[] nums = {1,4,2,5};
        List<Integer> res = findMissingElements(nums);
        System.out.println(res);
    }
    public static  List<Integer> findMissingElements(int[] nums) {
       
        boolean[] present = new boolean[101];
        int min = 101;
        int max = 0;
        
        
        for (int num : nums) {
            present[num] = true;
            if (num < min) min = num;
            if (num > max) max = num;
        }
        
        List<Integer> missing = new ArrayList<>();
        
        for (int i = min + 1; i < max; i++) {
            if (!present[i]) {
                missing.add(i);
            }
        }
        
        return missing;
    }
}
