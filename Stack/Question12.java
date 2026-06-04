import java.util.Stack;

public class Question12 {

    public static void main(String[] args) {

        String s = "abbaca";

        System.out.println(removeDuplicates(s));
    }

    public static String removeDuplicates(String s) {

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if(!stack.isEmpty() &&
               stack.peek() == ch) {

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