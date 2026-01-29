public class question07 {
     public static void main(String[] args) {
        int arr[] = {0,3,4,8,9,2,10};
        int result = findPeakElement(arr);
        System.out.println("peak index: " + result);
    }
    public static  int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end - start)/2;
            if(arr[mid+1]<arr[mid]){
                end = mid;
            }else{
                start = mid+1;
            }
        }  
        return start;
    }
}
