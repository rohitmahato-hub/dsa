import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nov17 {
    public static void main(String[] args) {
        String s = "abcac";
        int k = 2;
        System.out.println(minimumChanges(s, k));
    }
    public static int minimumChanges(String s, int k) {
        int n = s.length();
        List<List<Integer>> divisors = new ArrayList<>();
        for (int i = 0; i <= n; i++) divisors.add(new ArrayList<>());
        for (int d = 1; d < n; d++) {
            for (int len = d * 2; len <= n; len += d) {
                divisors.get(len).add(d);
            }
        }
        int[][] cost = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int len = j - i + 1;
                int minChanges = Integer.MAX_VALUE;

                for (int d : divisors.get(len)) {
                    int currentChanges = 0;
                    int groupLength = len / d;
                    for (int start = 0; start < d; start++) {
                        int left = 0, right = groupLength - 1;
                        while (left < right) {
                            if (s.charAt(i + start + left * d) != s.charAt(i + start + right * d)) {
                                currentChanges++;
                            }
                            left++;
                            right--;
                        }
                    }
                    minChanges = Math.min(minChanges, currentChanges);
                }
                cost[i][j] = minChanges;
            }
        }
        int[][] dp = new int[n + 1][k + 1];
        for (int[] row : dp) Arrays.fill(row, 1000000);
        dp[n][0] = 0; 
        for (int i = n - 2; i >= 0; i--) {
            for (int p = 1; p <= k; p++) {
                for (int j = i + 1; j < n; j++) {
                    dp[i][p] = Math.min(dp[i][p], cost[i][j] + dp[j + 1][p - 1]);
                }
            }
        }

        return dp[0][k];
    }
}
