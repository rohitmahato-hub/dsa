import java.util.ArrayList;
import java.util.List;

public class Oct29 {
    public static void main(String[] args) {
        int n = 3;
        int[][] edges = {{0,1},{1,2}};
        String s = "aac";
        String[] queries = {"query 0 2","update 1 b","query 0 2"};
        System.out.println(new Oct29().palindromePath(n, edges, s, queries));
    }
    int[] tin, tout;      
    int timer;           
    int[][] up;           
    int[] bit;            
    int n, LOG;
    char[] chars;         

    public List<Boolean> palindromePath(int n, int[][] edges, String s, String[] queries) {
        this.n = n;
        this.LOG = (int) Math.ceil(Math.log(n) / Math.log(2)) + 1;
        tin = new int[n];
        tout = new int[n];
        up = new int[n][LOG];
        bit = new int[n + 2]; 
        chars = s.toCharArray();
        timer = 0;
        List<List<Integer>> adj = new ArrayList<>(n);
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        dfs(0, 0, adj);
        for (int i = 0; i < n; i++) {
            int mask = 1 << (chars[i] - 'a');
            rangeUpdate(tin[i], tout[i], mask);
        }
        List<Boolean> ans = new ArrayList<>();
        for (String q : queries) {
            String[] parts = q.split(" ");
            if (parts[0].equals("update")) {
                int u = Integer.parseInt(parts[1]);
                char newChar = parts[2].charAt(0);
                
                int oldMask = 1 << (chars[u] - 'a');
                int newMask = 1 << (newChar - 'a');
                
                rangeUpdate(tin[u], tout[u], oldMask ^ newMask);
                chars[u] = newChar; 
                
            } else {
                int u = Integer.parseInt(parts[1]);
                int v = Integer.parseInt(parts[2]);
                int lca = getLca(u, v);
                
                int maskU = query(tin[u]);
                int maskV = query(tin[v]);
                int maskLca = 1 << (chars[lca] - 'a');
                
                int pathMask = maskU ^ maskV ^ maskLca;
              
                ans.add(Integer.bitCount(pathMask) <= 1);
            }
        }
        return ans;
    }
    void dfs(int u, int p, List<List<Integer>> adj) {
        tin[u] = ++timer;
        up[u][0] = p;
        
        for (int i = 1; i < LOG; i++) {
            up[u][i] = up[up[u][i - 1]][i - 1];
        }

        for (int v : adj.get(u)) {
            if (v != p) {
                dfs(v, u, adj);
            }
        }
        tout[u] = timer; 
    }
    boolean isAncestor(int u, int v) {
        return tin[u] <= tin[v] && tout[u] >= tout[v];
    }

    int getLca(int u, int v) {
        if (isAncestor(u, v)) return u;
        if (isAncestor(v, u)) return v;
        for (int i = LOG - 1; i >= 0; i--) {
            if (!isAncestor(up[u][i], v)) {
                u = up[u][i];
            }
        }
        return up[u][0];
    }
    void add(int idx, int val) {
        for (; idx <= n; idx += idx & -idx) {
            bit[idx] ^= val;
        }
    }
    void rangeUpdate(int l, int r, int val) {
        add(l, val);
        add(r + 1, val);
    }
    int query(int idx) {
        int res = 0;
        for (; idx > 0; idx -= idx & -idx) {
            res ^= bit[idx];
        }
        return res;
    }
}
