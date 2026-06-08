import java.util.Stack;
public class Question15 {
    public static void main(String args[]){
        String s = "()))((";
        System.out.println(minAddToMakeValid(s));
    }
     public static int minAddToMakeValid(String s) {
      int count = 0;
      Stack<Character> stack = new Stack<>();
      for(int i = 0;i<s.length();i++){
        char ch = s.charAt(i);
         if(ch == '('){
            stack.push(ch);
         }else{
            if(!stack.isEmpty()){
                stack.pop();
            }else{
                count++;
            }
         }
      }
      return count + stack.size();  
    }
}
