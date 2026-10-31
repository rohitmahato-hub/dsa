import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Oct30 {
    public static void main(String[] args) {
      int n = 3;
      int[][] edges = {{0,1,1},{1,2,1},{0,2,3}};
      String labels = "aab";
      int k = 1;
      System.out.println(Oct30.shortestPath(n, edges, labels, k));
    }
     @SuppressWarnings("unchecked")
    public static int shortestPath(int n, int[][] edges, String labels, int k) {
    
        List<int[]>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            adj[edge[0]].add(new int[]{edge[1], edge[2]}); 
        }

        int[][] dist = new int[n][k + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        dist[0][1] = 0;
        pq.offer(new int[]{0, 0, 1});

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int cost = curr[0];
            int u = curr[1];
            int count = curr[2];

            if (u == n - 1) {
                return cost;
            }
            if (cost > dist[u][count]) {
                continue;
            }
            for (int[] neighbor : adj[u]) {
                int v = neighbor[0];
                int weight = neighbor[1];
                int nextCount = (labels.charAt(u) == labels.charAt(v)) ? count + 1 : 1;
                if (nextCount <= k) {
                    if (cost + weight < dist[v][nextCount]) {
                        dist[v][nextCount] = cost + weight;
                        pq.offer(new int[]{cost + weight, v, nextCount});
                    }
                }
            }
        }

        return -1; 
    }
}
