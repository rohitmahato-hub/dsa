import java.util.Stack;

public class Oct05 {
    public static void main(String[] args) {
        String s = "()(())";
        System.out.println(scoreOfParentheses(s));
    }

    public static int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0); 

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(0);
            } else {
                int inner = stack.pop();
                int outer = stack.pop();
                int score = outer + Math.max(2 * inner, 1);
                stack.push(score);
            }
        }

        return stack.pop();
    }
}