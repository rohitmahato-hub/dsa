import java.util.Arrays;
public class Question04 {
    public static void main(String[] args) {
        int arr[] = {7, 5, 4, 3, 9};
        ascendingOrder(arr);
    }
    public static void ascendingOrder(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
           for(int j=0;j<n-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
           } 
        }
        System.out.println(Arrays.toString(arr));
    }
}
