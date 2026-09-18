public class Question25 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int res = maxProfit(prices);
        System.out.println(res);
    }
    public static int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;
        for(int i = 0; i< prices.length;i++){
            buyPrice = Math.min(buyPrice, prices[i]);
            profit = Math.max(profit, prices[i] - buyPrice);
        }
        return profit;
    }
}
