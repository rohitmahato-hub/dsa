public class quickSort {
    public static void main(String[] args) {
        int arr[] = {34,5,56,32,17,10};
        quickSortt(arr,0,arr.length-1);
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
    public static int partition(int arr[],int start,int end){
       int pivot = arr[end];
       int pos = start-1;
       for(int i=start;i<end;i++){
        if(arr[i]<pivot){
            int temp=arr[i];
            arr[i]=arr[pos];
            arr[pos]=temp;
            pos++;
        }
       }
       int temp = arr[pos];
       arr[pos] = arr[end];
       arr[end] = temp; 
       return pos+1;
    }
    public static void quickSortt(int arr[], int start,int end){
        if(start>=end){
            return;
        }
        int pivot = partition(arr,start,end);
        quickSortt(arr,start,pivot-1);
        quickSortt(arr,pivot+1,end);
    }
}
