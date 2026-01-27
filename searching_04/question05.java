public class question05 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int result = binarySearch(nums, 5);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Found element at index: " + result);
        }
    }

    public static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
