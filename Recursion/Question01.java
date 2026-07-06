public class Question01 {
    public static void main(String args[]){
        int n = 5;
        int res = factorial(n);
        System.out.println(res);
    }
    public static int factorial(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        return n * factorial(n-1);
    }
}
