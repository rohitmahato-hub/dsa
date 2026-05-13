import java.util.HashMap;

public class Question14 {
    public static void main(String args[]){
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        //brute force

    //   Map<Character,Integer> map = new HashMap<>();

    //   int left = 0;
    //   int maxLen = 0;

    //   for(int right = 0; right< s.length();right++){
    //     char ch = s.charAt(right);
    //     map.put(ch, map.getOrDefault(ch,0)+ 1);

    //     while(map.get(ch) > 1){
    //         char leftchar = s.charAt(left);
    //         map.put(leftchar, map.get(leftchar) - 1);
    //         left++;
    //     }
    //     maxLen = Math.max(maxLen, right-left+1); 
    //   }
    //   return maxLen;

// better apporach

     HashMap<Character, Integer> map = new HashMap<>();

    int left= 0;
    int max= 0;
     for (int right=0; right< s.length(); right++){
        char ch = s.charAt(right);

        if (map.containsKey(ch)){
           left = Math.max(left, map.get(ch) + 1);
        }
        map.put(ch,right);
        max = Math.max(max,right-left+1);
     }
     return max;
    }
}
