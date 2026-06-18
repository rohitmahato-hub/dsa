import java.util.HashMap;
import java.util.Map;

public class Question22 {
    public static void main(String[] args) {
        int[] fruits = {1,2,3,2,2};
        int res = totalFruit(fruits);
        System.out.println(res);
    }
    public static int totalFruit(int[] fruits) {

        int n = fruits.length;
        Map<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int right = 0;
        int count = 0;

        while (right < n) {

            map.put(fruits[right],
                    map.getOrDefault(fruits[right], 0) + 1);

            while (map.size() > 2) {

                map.put(fruits[left],
                        map.get(fruits[left]) - 1);

                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }

                left++;
            }

            count = Math.max(count, right - left + 1);

            right++;
        }

        return count;
    }
}
