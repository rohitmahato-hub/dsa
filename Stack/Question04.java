import java.util.Arrays;
import java.util.Stack;

public class Question04 {
    public static void main(String[] args) {
        int arr[] = {100,80,60,70,60,75,85};
        int span[] = stockSpan(arr);
        System.out.println(Arrays.toString(span));
    }
   public static int[] stockSpan(int[] prices) {

        int n = prices.length;

        int[] span = new int[n];

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++) {

            while(!stack.isEmpty() &&
                  prices[stack.peek()] <= prices[i]) {

                stack.pop();
            }

            if(stack.isEmpty()) {

                span[i] = i + 1;

            } else {

                span[i] = i - stack.peek();
            }

            stack.push(i);
        }

        return span;
    }
}
