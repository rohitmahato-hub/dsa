import java.util.Arrays;
import java.util.Stack;

public class Question09 {
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        int[] res = dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(res));
        
    }
    public static int[] dailyTemperatures(int[] temperatures) {
       
       int n = temperatures.length;
       int answer[] = new int[n];
       Stack<Integer> stack = new Stack<>();
       for(int i = n-1;i>=0;i--){
          while(!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]){
            stack.pop();
          }
          if(!stack.isEmpty()){
            answer[i] = stack.peek() - i;
          }
          stack.push(i);
       } 
       return answer;
    }
}
