public class Question14 {
    public static void main(String[] args) {
        String s = "ABFCACDB";
        System.out.println(minLength(s));
    }
    public static int minLength(String s) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty()) {
                if ((c == 'B' && stack.peek() == 'A') || (c == 'D' && stack.peek() == 'C')) {
                    stack.pop();
                    continue;
                }
            }
            stack.push(c);
        }
        
        return stack.size();
    }
}
