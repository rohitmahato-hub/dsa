public class question10 {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        powerSet(arr);
    }
    public static void powerSet(int arr[]){
        int n = arr.length;
        int total = 1 << n;
        for(int subset = 0;subset<total;subset++){
            System.out.print("{ ");
            for(int i=0;i<n;i++){
                if((subset & (1 << i)) != 0){
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println("}");
        }
    }
}
