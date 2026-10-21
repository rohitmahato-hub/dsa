public class Oct21 {
    public static void main(String[] args) {
        String s = "dog";
        System.out.println(Oct21.minOperations(s));
    }
    public static int minOperations(String s) {
        int n = s.length();
        
        boolean isSorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) return 0;
        
        if (n == 2) return -1;
        
        char minChar = 'z';
        char maxChar = 'a';
        for (int i = 0; i < n; i++) {
            char curr = s.charAt(i);
            if (curr < minChar) {
                minChar = curr;
            }
            if (curr > maxChar) {
                maxChar = curr;
            }
        }
        if (s.charAt(0) == minChar || s.charAt(n - 1) == maxChar) {
            return 1;
        }
        
        if (s.lastIndexOf(maxChar) == 0 && s.indexOf(minChar) == n - 1) {
            return 3;
        }
        return 2;
    }
}
