import java.util.Stack;

public class Question13 {
    public static void main(String args[]){
       String s = "leEeetcode";
       System.out.println(makeGood(s));
    }
    public static String makeGood(String s) {

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if(!stack.isEmpty() &&
               Math.abs(stack.peek() - ch) == 32) {

                stack.pop();

            } else {

                stack.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();

        for(char ch : stack) {

            sb.append(ch);
        }

        return sb.toString();
    }
}
