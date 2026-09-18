import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sept18 {
    public static void main(String[] args) {
        String s = "adefaddaccc";
        List<String> res = maxNumOfSubstrings(s);
        System.out.println(res.size());
    }
    public static List<String> maxNumOfSubstrings(String s) {
        int[] first = new int[26];
        int[] last = new int[26];
        Arrays.fill(first, -1);
        
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            if (first[c] == -1) {
                first[c] = i;
            }
            last[c] = i;
        }
        
        List<int[]> validIntervals = new ArrayList<>();
        
        for (int i = 0; i < 26; i++) {
            if (first[i] == -1) continue; 
            
            int left = first[i];
            int right = last[i];
            boolean isValid = true;
            
            for (int j = left; j <= right; j++) {
                int c = s.charAt(j) - 'a';
                
                if (first[c] < left) {
                    isValid = false;
                    break;
                }
                
                right = Math.max(right, last[c]);
            }
            
            if (isValid) {
                validIntervals.add(new int[]{left, right});
            }
        }
        
        validIntervals.sort((a, b) -> a[1] != b[1] ? Integer.compare(a[1], b[1]) : Integer.compare(b[0], a[0]));
        
        List<String> res = new ArrayList<>();
        int lastEnd = -1;
        
        for (int[] interval : validIntervals) {
           
            if (interval[0] > lastEnd) {
                res.add(s.substring(interval[0], interval[1] + 1));
                lastEnd = interval[1];
            }
        }
        
        return res;
    }
}
