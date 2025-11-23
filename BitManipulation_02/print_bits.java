public class print_bits {
     public static void main(String[] args) {
         printBits(35);
     }
     public static void printBits(int num){
        for(int i=7;i>=0;i--){
            System.out.print((num>>i) & 1);
        }
     }
}
