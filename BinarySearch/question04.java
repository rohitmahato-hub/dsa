public class question04 {
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j'};
        char result = nextGreatestLetter(arr, 'a');
        System.out.println(result);
    }

    public static char nextGreatestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return arr[start % arr.length];
    }
}
