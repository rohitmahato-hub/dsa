import java.util.Stack;

public class Question15 {
    public static void main(String args[]){
        String s = "()[]{}";
        System.out.println(isValid(s));

    }
    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        int left = 0;

        while(left < s.length()) {

            char ch = s.charAt(left);

            if(ch == '(' || ch == '{' || ch == '[') {

                stack.push(ch);

            } else {

                if(stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if((ch == ')' && top != '(') ||
                   (ch == '}' && top != '{') ||
                   (ch == ']' && top != '[')) {

                    return false;
                }
            }

            left++;
        }

        return stack.isEmpty();
    }
}
