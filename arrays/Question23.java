import java.util.Arrays;

public class Question23 {
   public static void main(String args[]){
      int[] costs = {1,3,2,4,1};
      int coins = 7;
      int res = maxIceCream(costs,coins);
      System.out.println(res);
   }
   public static int maxIceCream(int[] costs, int coins) {
        
        int count = 0;
        Arrays.sort(costs);
       
        for(int i = 0; i<costs.length;i++){
            if(costs[i] > coins){
                break;
            }
            
            coins -= costs[i];
            count++;
        }
        return count;
    }
}
