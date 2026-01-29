public class question06 {
    public static void main(String[] args) {
        int arr[] = {0,3,4,8,9,2};
        int result = peakIndexInMountainArray(arr);
        System.out.println("peak index: " + result);
    }
    public static  int peakIndexInMountainArray(int[] arr) {
        int start = 1;
        int end = arr.length-2;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
                return mid;
            }else if(arr[mid-1]<arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }  
        return -1;
    }
}
