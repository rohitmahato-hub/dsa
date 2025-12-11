public class question12 {
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,6,2};
        numbersAppearingOneTimes(arr);
    }
    public static void numbersAppearingOneTimes(int arr[]){
        int l = arr.length;
        int res = 0;
        for(int i = 0;i < l;i++){
            res = res ^ arr[i];
        }
       
       int rightMostSetBit = res & -res;
       int num1 = 0;
       int num2 = 0;

       for(int i=0;i<l;i++){
        if((arr[i] & rightMostSetBit) != 0){
            num1 = num1 ^ arr[i];
        }else{
            num2 = num2 ^ arr[i];
        }
       }
       System.out.println(num1 + " " + num2);
    }
}
