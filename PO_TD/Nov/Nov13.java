import java.util.ArrayDeque;
import java.util.Deque;

public class Nov13 {
    public static void main(String[] args) {
        int[] nums = {6,3,1,2,4,4};
        int k = 7;
        System.out.println(countNonDecreasingSubarrays(nums,k));
    }
    public static long countNonDecreasingSubarrays(int[] nums, int k) {
        int n = nums.length;

        long ans = 0;
        long cost = 0;
        int right = n - 1;

        Deque<int[]> dq = new ArrayDeque<>();

        for(int left = n - 1; left >= 0; left--) {
            int cnt = 1;

            while(!dq.isEmpty() && dq.peekLast()[0] < nums[left]) {
                int[] last = dq.removeLast();

                cost += (long) (nums[left] - last[0]) * last[1];
                cnt += last[1];
            }

            dq.addLast(new int[]{nums[left], cnt});

            while(cost > k) {
                int[] first = dq.peekFirst();

                cost -= first[0] - nums[right];

                if(first[1] == 1) {
                    dq.removeFirst();
                }
                else {
                    first[1]--;
                }

                right--;
            }

            ans += right - left + 1;
        }

        return ans;
    }
}
