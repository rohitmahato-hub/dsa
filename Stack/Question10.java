import java.util.Arrays;
import java.util.Stack;

public class Question10 {
    public static void main(String[] args){
       int[] asteroids = {5,10,-5};
       int[] res = asteroidCollision(asteroids);
       System.out.println(Arrays.toString(res));
    }
    public static int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for(int asteroid : asteroids) {

            boolean destroyed = false;

            while(!stack.isEmpty() &&
                  stack.peek() > 0 &&
                  asteroid < 0) {

                if(stack.peek() < -asteroid) {

                    stack.pop();

                } else if(stack.peek() == -asteroid) {

                    stack.pop();
                    destroyed = true;
                    break;

                } else {

                    destroyed = true;
                    break;
                }
            }

            if(!destroyed) {

                stack.push(asteroid);
            }
        }

        int[] res = new int[stack.size()];

        for(int i = stack.size() - 1; i >= 0; i--) {

            res[i] = stack.pop();
        }

        return res;
    }
}
