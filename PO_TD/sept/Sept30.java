import java.util.Arrays;

public class Sept30 {
    public static void main(String[] args) {
        String seq = "(()())";
        System.out.println(Arrays.toString(new Sept30().maxDepthAfterSplit(seq)));
    }

    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int[] answer = new int[n];
        int depth = 0;

        for (int i = 0; i < n; i++) {
            if (seq.charAt(i) == '(') {
                depth++;
                answer[i] = depth % 2;
            } else {
                answer[i] = depth % 2;
                depth--;
            }
        }

        return answer;
    }
}
