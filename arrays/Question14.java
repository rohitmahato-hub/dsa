public class Question14 {
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        int k = 0;
        int val = 2;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != val){
                arr[k] = arr[i];
                k++;
            }
        }
        System.out.println(k);
    }
}
