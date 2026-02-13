public class selection {
    public static void main(String args[]){
        int arr[] = {10,8,2,3,1,4};
        selectionSort(arr);
    }
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
           int index = i;
           for(int j=i+1;j<arr.length;j++){
               if(arr[j]<arr[index]){
                index = j;
               }
           }
           int temp = arr[i];
           arr[i] = arr[index];
           arr[index] = temp;
        }
        for(int num : arr){
            System.out.print(num +" ");
        }
    }
}