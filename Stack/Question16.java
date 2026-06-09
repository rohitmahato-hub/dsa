import java.util.Stack;

public class Question16 {
    public static void main(String args[]){
       String s = "(())";
       System.out.println(scoreOfParentheses(s));
    }
    public static int scoreOfParentheses(String s) {
       Stack<Integer> stack = new Stack<>();
       int count = 0;
       for(int i = 0;i<s.length();i++){
        char ch = s.charAt(i);
        if(ch == '('){
            stack.push(count);
            count = 0;
        }else{
            count = stack.pop() + Math.max(2*count,1);
        }
       } 
       return count;
    }
}
