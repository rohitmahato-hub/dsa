import java.util.Arrays;

public class Question07 {
    public static void main(String[] args) {
        int arr[] = {1,3,2,4,5};
        int D = 3;
        leftRotateElementByDPlace(arr, D);

    }
    public static void leftRotateElementByDPlace(int arr[],int D){
        int temp = arr[0];
        int n = arr.length;
        for(int i = 1;i < D;i++){
            arr[i-1] = arr[i];
        }
        arr[D-1] = temp;
        System.out.println(Arrays.toString(arr));
    }
    
}
