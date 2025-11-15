public class increasing_letter_triangle {
    public static void main(String[] args) {

        for(int i=0;i<=4;i++){
            for(char ch='A';ch<='A' + i;ch++){
               System.out.print( ch + " ");
            }
            System.out.println();
        }
    }
}
