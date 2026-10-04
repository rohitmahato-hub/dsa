
import java.util.Stack;

public class Oct04 {
    public static void main(String[] args) {
       String s = "(*))";
       System.out.println(Oct04.checkValidParentheses(s));
    }
    public static boolean checkValidParentheses(String s) {
        Stack<Integer> extraOpenBrackets = new Stack<>();
        Stack<Integer> starIndexes = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                extraOpenBrackets.push(i);
            } else if (ch == '*') {
                starIndexes.push(i);
            } else if (ch == ')') {
                if (!extraOpenBrackets.isEmpty()) {
                    extraOpenBrackets.pop();
                } else if (!starIndexes.isEmpty()) {
                    starIndexes.pop();
                } else {
                    return false;
                }
            }
        }

        while (!extraOpenBrackets.isEmpty()) {
            if (starIndexes.isEmpty()) {
                return false;
            }
            if (extraOpenBrackets.peek() > starIndexes.peek()) {
                return false;
            }
            extraOpenBrackets.pop();
            starIndexes.pop();
        }

        return true;
    }
}
