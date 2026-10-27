public class Oct26 {
    public static void main(String[] args) {
       int[][] grid = {{0,2,1,0,0},{0,5,0,0,5},{0,0,1,0,0},{0,1,4,7,0},{0,2,0,0,8}};
       int k = 1;
    System.out.println(Oct26.countIslands(grid, 1));
    }
     public static int countIslands(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    long islandSum = dfs(grid, i, j, m, n);
                    
                    if (islandSum % k == 0) {
                        count++;
                    }
                }
            }
        }
        
        return count;
    }
    
    private static long dfs(int[][] grid, int i, int j, int m, int n) {
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0) {
            return 0;
        }
        long sum = grid[i][j];
        grid[i][j] = 0;
        
        sum += dfs(grid, i + 1, j, m, n); // Down
        sum += dfs(grid, i - 1, j, m, n); // Up
        sum += dfs(grid, i, j + 1, m, n); // Right
        sum += dfs(grid, i, j - 1, m, n); // Left
        
        return sum;
    }
}
