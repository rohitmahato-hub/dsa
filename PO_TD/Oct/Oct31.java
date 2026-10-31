public class Oct31 {
    public static void main(String[] args) {
        int[][] grid = {{0,1,0},{0,0,1},{1,0,0}};
        System.out.println(uniquePaths(grid));
    }
    public  static int uniquePaths(int[][] grid) {
        int mod = 1000000007;
        int[] down = new int [grid[0].length];
        down[0] = 1;
        for(int[] row : grid){
            int right = 0;
            for(int j = 0; j< row.length;j++){
                if(row[j] == 1){
                    int t = right;
                    right = down[j];
                    down[j] = t;
                }else{
                    right = down[j] = (right + down[j]) % mod;
                }
            }
        }
        return down[down.length -1];
    }
}
