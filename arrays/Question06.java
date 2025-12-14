import java.util.Arrays;

public class Question06 {
    public static void main(String[] args) {
        int arr[] = {1,3,2,4,5};
        leftRotateElement(arr);
    }
    public static void leftRotateElement(int arr[]){
        int temp = arr[0];
        int n = arr.length;
        for(int i = 1;i < n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        System.out.println(Arrays.toString(arr));
    }
    
}
