import java.util.Scanner;
public class reverse_star_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= i-1;j++){
                System.out.print(" ");
            }
            for(int j = 1;j <= 2*n-(2*i+1);j++){
                System.out.print("*");
            }
            for(int j = 1;j <= i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
