public class question01 {
    public static void main(String[] args) {
        int arr[] = {2,2,4,3,5,6,7,9};
        linearSearch(arr,7);
    }
    public static  void linearSearch(int arr[], int target){
        int ans = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                ans = i;
                break;
            }
        }
        if(ans == -1){
            System.out.println("element not found");
        }else{
            System.out.println("element found at index:" +ans);
        }
    }
}
