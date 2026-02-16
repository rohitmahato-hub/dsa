public class insertion {
    public static void main(String args[]){
        int arr[] = {10,8,2,3,1,4};
        insertionSort(arr);
    }
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
           for(int j=i;j>0;j--){
               if(arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
               }else{
                break;
               }
           }
          
        }
        for(int num : arr){
            System.out.print(num +" ");
        }
    }
}
