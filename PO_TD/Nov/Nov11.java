public class Nov11 {
    public static void main(String[] args) {
        int cost1 = 3;
        int cost2 = 2;
        int costBoth = 1;
        int need1 = 3;
        int need2 = 2;
        System.out.println(minimumCost(cost1, cost2, costBoth, need1, need2));
    }
    public static long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        if(need1 == 0 && need2 == 0){
            return 0;
        }
        long minCost = 0;
        long commonNeed = Math.min(need1, need2);
        minCost += commonNeed * Math.min((long) costBoth, (long) cost1 + cost2);

        long rem1 = need1 - commonNeed;
        minCost += rem1 * Math.min((long) costBoth, (long) cost1);

        long rem2 = need2 - commonNeed;
        minCost += rem2 * Math.min((long) costBoth, (long) cost2);
        
        return minCost; 
    }
}
