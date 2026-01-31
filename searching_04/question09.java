public class question09 {
    public static void main(String[] args) {
        int piles[] = {30,11,23,4,20};
        int h = 5;
        int result =  minEatingSpeed(piles,h);
        System.out.println (result);
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = 0;
        for (int pile : piles) {
            end = Math.max(end, pile);
        } 
        while (start < end) {
            int mid = start + (end - start) / 2;

            int hours = 0;
            for (int pile : piles) {
                hours += (pile + mid - 1) / mid;
            }

            if (hours <= h) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}
