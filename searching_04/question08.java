public class question08 {
     public static void main(String[] args) {
        int arr[] = {3,4,8,9,2,10};
        int result = findMin(arr);
        System.out.println (arr[result]);
    }
    public static  int findMin(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end - start)/2;
            if(arr[end]<arr[mid]){
                start = mid+1;
            }else{
                end = mid;
            }
        }  
        return start;
    }
}
