public class setTheIthBit {
    public static void main(String[] args) {
        int res = setIthBit(32, 4);
        System.out.println(res);
    }
    public static int setIthBit(int num, int bit){
        return num | (1<<bit);
    }
}
