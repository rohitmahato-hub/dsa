public class question09 {
    public static void main(String[] args) {
        boolean res = checkPowerOf2(17);
        System.out.println(res);
    }
    public static boolean checkPowerOf2(int num){
        if(num > 0 && (num & (num - 1)) == 0){
            System.out.println("true");
            return true;
        }else{
            System.out.println("false");
            return false;
        }
    }
}
