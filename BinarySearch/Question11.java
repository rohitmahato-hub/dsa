

public class Question11 {
    public static void main(String[] args) {
       int[] weights = {1,2,3,4,5,6,7,8,9,10};
       int days = 5;
       int res = shipWithinDays(weights,days);
       System.out.println(res);
    }
    public static int shipWithinDays(int[] weights, int days) {
        int maxWeight = 0;
        int totalWeight = 0;
        
        for (int weight : weights) {
            maxWeight = Math.max(maxWeight, weight);
            totalWeight += weight;
        }
        
        int low = maxWeight;
        int high = totalWeight;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (canShip(weights, days, mid)) {
                high = mid - 1; 
            } else {
                low = mid + 1; 
            }
        }
        
        return low; 
    }
    
    private static boolean canShip(int[] weights, int maxDays, int capacity) {
        int daysNeeded = 1;
        int currentLoad = 0;
        
        for (int weight : weights) {
            currentLoad += weight;
            if (currentLoad > capacity) {
                daysNeeded++;
                currentLoad = weight; 
            }
        }
        
        return daysNeeded <= maxDays;
    }
}
