public class Question14 {
    public static void main(String[] args) {
        int n = 11;
        int res = hammingWeight(n);
        System.out.println(res);
    }
     public static int hammingWeight(int n) {
        // int temp = 0;
        // while(n > 0){
        //     if((n & 1) == 1){
        //         temp++;
        //     }
        //     n = n >> 1;
        // }
        // return temp;

        int temp = 0;
        while(n != 0){
            n = n &(n-1);
            temp++;
        }
        return temp;
    }
}
