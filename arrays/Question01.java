import java.util.Arrays;
public class Question01 {
        public static int[] insert(int arr[], int num, int pos){
            int newArr[] = new int[arr.length + 1];
            for(int i=0;i<pos;i++){
                newArr[i] = arr[i];
            }
            newArr[pos] = num;

            for(int i=pos;i<arr.length;i++){
                newArr[i+1] = arr[i];
            }
            return newArr;
        } 
        public static void main(String[] args) {
            int arr[] = {10,5,6,7,15};
            int num = 24;
            int pos = 3;
            int result[] = insert(arr, num, pos);
            System.out.println(Arrays.toString(result));
        }
}
