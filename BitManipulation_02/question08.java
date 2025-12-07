public class question08 {
    public static void main(String[] args) {
       int res = checkIthBit(13,3);
       System.out.println(res); 
    }
    public static int checkIthBit(int num, int bit){
       if(((num>>bit) & 1)==0){
        System.out.println("set ");
        return 0;
       } else{
        System.out.println("unset ");
        return 1;
       }
    }
}
