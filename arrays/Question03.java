public class Question03 {
    public static void main(String[] args) {
        int arr[] = {2, 4, 7, 8, 5};
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        for(int i = 0;i < arr.length;i++){
            if(arr[i] != largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}