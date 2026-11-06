import java.util.Arrays;
public class Nov06 {
    public static void main(String[] args) {
        int n = 3;
        int[][] logs = {{1,3},{2,6},{1,5}};
        int x = 5;
        int[] queries = {10,11};
        System.out.println(Arrays.toString(countServers(n, logs, x, queries)));
    }
    public  static int[] countServers(int n, int[][] logs, int x, int[] queries) {
        Arrays.sort(logs, (a, b) -> Integer.compare(a[1], b[1]));
        
        int qLen = queries.length;
        int[][] sortedQueries = new int[qLen][2];
        
        for (int i = 0; i < qLen; i++) {
            sortedQueries[i][0] = queries[i]; 
            sortedQueries[i][1] = i;
        }
        Arrays.sort(sortedQueries, (a, b) -> Integer.compare(a[0], b[0]));
        
        int[] result = new int[qLen];
        
        int[] serverCounts = new int[n + 1]; 
        int uniqueActive = 0; 
        int left = 0;
        int right = 0; 
        for (int i = 0; i < qLen; i++) {
            int queryTime = sortedQueries[i][0];
            int originalIndex = sortedQueries[i][1];
            
            int windowStart = queryTime - x;
            int windowEnd = queryTime;
            
            while (right < logs.length && logs[right][1] <= windowEnd) {
                int serverId = logs[right][0];
                if (serverCounts[serverId] == 0) {
                    uniqueActive++;
                }
                serverCounts[serverId]++;
                right++;
            }
            while (left < logs.length && logs[left][1] < windowStart) {
                int serverId = logs[left][0];
                serverCounts[serverId]--;
                if (serverCounts[serverId] == 0) {
                    uniqueActive--; 
                }
                left++;
            }
            result[originalIndex] = n - uniqueActive;
        }
        
        return result;
    }
}
