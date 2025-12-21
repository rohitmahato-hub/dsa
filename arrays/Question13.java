public class Question13 {
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        int k = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[i-1]){
                arr[k] = arr[i];
                k++;
            }
        }
        System.out.println(k);
    }
}
