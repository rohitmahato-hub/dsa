public class question02 {
    public static void main(String[] args) {
        mySqrt(16);
    }
     public static void mySqrt(int x) {
        int start = 0;
        int end = x;
        int ans = 0;
         while(start <= end) {
            int mid = start + (end - start) / 2;

            if ((long) mid * mid <= x) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
