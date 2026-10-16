public class Oct14{
    public static void main(String[] args) {
        int num = 2;
        int sum = 3;
        System.out.println(Oct14.maxSumOfSquares(num, sum));
    }
     public static String maxSumOfSquares(int num, int sum) {
        
        if (sum > 9 * num) {
            return "";
        }
        
        int nines = sum / 9;
        int remainder = sum % 9;
        StringBuilder ans = new StringBuilder(num);
        
        for (int i = 0; i < nines; i++) {
            ans.append('9');
        }
        
        if (remainder > 0) {
            ans.append((char) ('0' + remainder));
        }
        
        while (ans.length() < num) {
            ans.append('0');
        }
        
        return ans.toString();
    }
}