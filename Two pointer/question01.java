public class question01 {
    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 6, 11};

        int[] result = twoSum(arr, 14);

        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] twoSum(int[] arr, int target) {

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            int sum = arr[i] + arr[j];

            if (sum == target) {
                return new int[]{i + 1, j + 1};
            }

            if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return new int[]{-1, -1};
    }
}
