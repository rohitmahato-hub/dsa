public class Question05 {
    public static void main(String[] args) {
        int arr[] = {2,3,3,4,3,5,6};
        findDuplicate(arr);
    }
    public static void findDuplicate(int arr[]){
        System.out.println("duplicate elements: ");
        for(int i = 0;i < arr.length; i++){
            for(int j = i+1;j < arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        } 
    }
}
