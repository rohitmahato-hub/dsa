public class Question09 {
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 17;
        twoIndexSum(arr,target);
        
    }
    public static void twoIndexSum(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i + " , " + j);
                }
            }
        }
    }
}
