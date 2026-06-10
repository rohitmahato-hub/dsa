import java.util.Stack;

public class Question17 {
    public static void main(String[] args) {
       String s = ")()())";
       System.out.println(longestValidParentheses(s)); 
    }
    public static int longestValidParentheses(String s) {
    //    int left = 0;
    //    int right = 0;
    //    int max = 0;
    //    for(int i = 0;i<s.length();i++){
    //     char ch = s.charAt(i);
    //     if(ch == '('){
    //         left++;
    //     }else{
    //         right++;
    //     }
    //     if(left == right){
    //         max = Math.max(max,left*2);
    //     }else if(right>left){
    //         left=0;
    //         right =0;
    //     }
    //    }
    //    left = 0;
    //    right = 0;
    //    for(int i = s.length()-1;i>=0;i--){
    //       char ch = s.charAt(i);
    //     if(ch == '('){
    //         left++;
    //     }else{
    //         right++;
    //     }
    //     if(left == right){
    //         max = Math.max(max,left*2);
    //     }else if(left>right){
    //         left=0;
    //         right =0;
    //     }
    //    } 
    //    return max;


     Stack<Integer> stack = new Stack<>();
       int max = 0;
       stack.push(-1);
       for(int i = 0;i<s.length();i++){
        char ch = s.charAt(i);
        if(ch == '('){
            stack.push(i);
        }else{
            stack.pop();
            if(stack.isEmpty()){
                stack.push(i);
            }
            max = Math.max(max,i - stack.peek());
        }
       }
       return max;
    
    }
}
