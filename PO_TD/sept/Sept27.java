import java.util.Stack;

public class Sept27 {
    public static void main(String[] args) {
        String s = "(abcd)";
        System.out.println(new Sept27().reverseParentheses(s));
    }
     public String reverseParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '(') {
            
                stack.push(res.length());
            } else if (ch == ')') {
            
                int start = stack.pop();
            
                reverse(res, start, res.length() - 1);
            } else {
     
                res.append(ch);
            }
        }
        
        return res.toString();
    }
    
    private void reverse(StringBuilder sb, int left, int right) {
        while (left < right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }
    }
}
