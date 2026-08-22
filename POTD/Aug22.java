public class Aug22 {
    public static void main(String[] args) {
      int n = 23;
      boolean res = checkDivisibility(n);
      System.out.println(res);  
    }
    public static boolean checkDivisibility(int n) {
      //int totalSum = 0;
      int sum = 0;
      int product = 1;
      int temp = n;
      while(temp > 0){
        int digit = temp % 10;
        sum += digit;
        product *= digit;
        temp /= 10;
      }  
    //   totalSum = sum + product;
    //   if(n % totalSum == 0){
    //     return true;
    //   }else{
    //     return false;
    //   }
    return n % (sum + product) == 0;
    }
}
