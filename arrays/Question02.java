public class Question02 {
    public static void main(String[] args) {
        int arr[] = {-2,-5,-3,-6,-4};
        //int largest = 0;
        int largest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
