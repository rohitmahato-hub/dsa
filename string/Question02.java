public class Question02 {
    public static void main(String[] args) {
       String s =   "my name is rohit";
       System.out.println(reverseLetters(s));
    }
     public static String reverseLetters(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
       
        while(start < end){
         char temp = arr[start];
         arr[start] = arr[end];
         arr[end] = temp;
         start++;
         end--;
      }
       return new String(arr);
    }
}
