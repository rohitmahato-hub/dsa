public class question {

    public static void main(String args[]){
        int arr[] = {10,8,2,3,1,4,13};
        mergeSort(arr, 0, arr.length - 1);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    public static void mergeSort(int arr[], int start, int end){
        if(start < end){
            int mid = start + (end - start) / 2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);

            merge(arr, start, mid, end);
        }
    }

    public static void merge(int arr[], int start, int mid, int end){
        int[] temp = new int[end - start + 1];

        int i = start, j = mid + 1, k = 0;

        while(i <= mid && j <= end){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while(i <= mid){
            temp[k++] = arr[i++];
        }

        while(j <= end){
            temp[k++] = arr[j++];
        }

        for(int idx = 0; idx < temp.length; idx++){
            arr[start + idx] = temp[idx];
        }
    }
}
