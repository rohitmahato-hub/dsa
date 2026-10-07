import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Oct07 {
    public static void main(String[] args){
       String s = "()())()";
       System.out.println(Oct07.removeInvalidParentheses(s));
    }
    public static List<String> removeInvalidParentheses(String s) {
        
        int leftRemovals = 0;
        int rightRemovals = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                leftRemovals++;
            } else if (ch == ')') {
                if (leftRemovals > 0) {
                    leftRemovals--;
                } else {
                    rightRemovals++; 
                }
            }
        }
        
        Set<String> validStrings = new HashSet<>();
        backtrack(s, 0, leftRemovals, rightRemovals, validStrings);
        
        return new ArrayList<>(validStrings);
    }
    
    private static void backtrack(String s, int index, int leftRemovals, int rightRemovals, Set<String> validStrings) {
      
        if (leftRemovals == 0 && rightRemovals == 0) {
            
            if (isValid(s)) {
                validStrings.add(s);
            }
            return;
        }
        
        for (int i = index; i < s.length(); i++) {
            
            if (i != index && s.charAt(i) == s.charAt(i - 1)) {
                continue;
            }
            
            char ch = s.charAt(i);
          
            if (ch == '(' || ch == ')') {
                String nextStr = s.substring(0, i) + s.substring(i + 1);
                if (ch == '(' && leftRemovals > 0) {
                    backtrack(nextStr, i, leftRemovals - 1, rightRemovals, validStrings);
                } 
              
                else if (ch == ')' && rightRemovals > 0) {
                    backtrack(nextStr, i, leftRemovals, rightRemovals - 1, validStrings);
                }
            }
        }
    }
  
    private static boolean isValid(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') count++;
            else if (ch == ')') count--;
            
            if (count < 0) return false; 
        }
        return count == 0;
    }
}
