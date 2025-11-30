public class question05 {
    public static void main(String[] args) {
        swap(5,6);
    }
    public static void swap(int num1, int num2){
        System.out.println("num1: "+num1+", num2: "+num2);

        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

       System.out.println("num1: "+num1+", num2: "+num2);
    }
}
