public class Question12 {
    public static void main(String[] args) {
        int[] dist = {1,3,2};
        int hour = 6;
        int res = minSpeedOnTime(dist, hour);

        System.out.println(res);
    }
    public static int minSpeedOnTime(int[] dist, double hour) {

        int low = 1;
        int high = 10000000;

        int ans = -1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if(canReach(dist, hour, mid)) {

                ans = mid;
                high = mid - 1;

            } else {

                low = mid + 1;
            }
        }

        return ans;
    }

    private static boolean canReach(int[] dist, double hour, int speed) {

        double totalTime = 0;

        for(int i = 0; i < dist.length; i++) {

            if(i == dist.length - 1) {

                totalTime += (double) dist[i] / speed;

            } else {

                totalTime += Math.ceil((double) dist[i] / speed);
            }
        }

        return totalTime <= hour;
    }
}
