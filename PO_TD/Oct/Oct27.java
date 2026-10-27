public class Oct27 {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        System.out.println(String.join(System.lineSeparator(), Oct27.createGrid(m, n)));
    }
     public  static String[] createGrid(int m, int n) {
        String[] grid = new String[m];
        grid[0] = ".".repeat(n);
        if (m > 1) {
            String otherRow = "#".repeat(n - 1) + ".";
            for (int i = 1; i < m; i++) {
                grid[i] = otherRow;
            }
        }
        
        return grid;
    }
}
