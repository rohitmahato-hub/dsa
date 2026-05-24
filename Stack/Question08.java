import java.util.Stack;

public class Question08 {

    public static void main(String[] args) {

        String s = "ab#c";
        String t = "ad#c";

        boolean res = backspaceCompare(s, t);

        System.out.println(res);
    }

    public static boolean backspaceCompare(String s, String t) {

        return build(s).equals(build(t));
    }

    public static String build(String str) {

        Stack<Character> stack = new Stack<>();

        for(char ch : str.toCharArray()) {

            if(ch != '#') {

                stack.push(ch);

            } else if(!stack.isEmpty()) {

                stack.pop();
            }
        }

        StringBuilder sb = new StringBuilder();

        for(char ch : stack) {

            sb.append(ch);
        }

        return sb.toString();
    }
}