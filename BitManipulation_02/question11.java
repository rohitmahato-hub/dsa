public class question11 {
    public static void main(String[] args) {
        int L = 4,R = 9;
        System.out.println(xorFromLToR(L,R));
    }
    public static int xorFromLToR(int L, int R){
        return xorTillN(R) ^ xorTillN(L-1);
        
    }
    public static int xorTillN(int num){
        if(num % 4 == 1) return 1;
        else if(num % 4 == 2) return num+1;
        else if(num % 4 == 3) return 0;
        else return num;
    }
    
    
}
