import java.util.Arrays;

public class Question08 {
    public static void main(String[] args) {
        int arr[] = {1,0,2,3,0,4,0,1};
        moveZerosToTheEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZerosToTheEnd(int arr[]){
        int temp = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                arr[temp] =arr[i];
                temp++;
            }
        }
        while(temp<arr.length){
            arr[temp] = 0;
            temp++;
        }
    }
}
