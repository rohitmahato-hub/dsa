public class checkANumberIsEvenOdd {
    public static void main(String[] args) {
        int num = 8;
        printEvenOdd(num);
    }
    public static void printEvenOdd(int num){
        if(isBitSet(num, 0)){
            System.out.println("number is odd");
        }else{
            System.out.println("number is even");
        }
    }
    public static boolean isBitSet(int num, int bit){
        int res = num & (1<<bit);
        return (res==0)?false:true;
    }
}
