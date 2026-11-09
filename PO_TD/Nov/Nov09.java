import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Nov09 {
    public static void main(String[] args) {
        int[] arrival = {1,2,3,4,5};
        int[] load = {5,2,3,3,3};
        int k = 3;
        System.out.println(busiestServers(k, arrival, load));
    }
    public static List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        int[] count = new int[k];
        TreeSet<Integer> available = new TreeSet<>();
        for (int i = 0; i < k; i++) {
            available.add(i);
        }
        
        PriorityQueue<int[]> busy = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        
        for (int i = 0; i < arrival.length; i++) {
            int arr = arrival[i];
            int dur = load[i];
            
            while (!busy.isEmpty() && busy.peek()[0] <= arr) {
                available.add(busy.poll()[1]); 
            }
            if (available.isEmpty()) {
                continue;
            }
            Integer server = available.ceiling(i % k);
            if (server == null) {
                server = available.first();
            }
            available.remove(server);
            busy.offer(new int[]{arr + dur, server});
            count[server]++;
        }
        int maxRequests = 0;
        for (int c : count) {
            maxRequests = Math.max(maxRequests, c);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            if (count[i] == maxRequests) {
                result.add(i);
            }
        }
        
        return result;
    }
}
