public class Question02 {
  public static void main(String[] args) {
     int n = 100;
     printNNumber(n);
  }

  public static void printNNumber(int n) {
    if (n == 0) return;
    printNNumber(n - 1);
    System.out.print(n + " ");
  }
}
