// public class Question03 {
//     public static void main(String[] args) {
//         String s = "my name is rohit";
//         System.out.println(reverseWords(s));
//     }
//      public static String reverseWords(String s) {
//         String arr[] = s.split(" ");
//         String res = "";
       
//         for(int i = arr.length-1;i>=0;i--){
//             if(arr[i].length() == 0){
//                 continue;
//             }
//             if(res.length() == 0){
//                 res += arr[i];
//             }else{
//                 res += " " + arr[i];
//             }
//         }
//         return res;
//     }
// }   // 2ms runtime


public class Question03 {
    public static void main(String[] args) {
        String s = "my name is rohit";
        System.out.println(reverseWords(s));
    }
     public static String reverseWords(String s) {
        String arr[] = s.split(" ");
       // String res = "";
        StringBuilder res =  new StringBuilder();
        for(int i = arr.length-1;i>=0;i--){
            if(arr[i].length() == 0){
                continue;
            }
            if(res.length() == 0){
                res.append(arr[i]);
            }else{
               res.append(" ");
               res.append(arr[i]);
            }
        }
        return res.toString();
    }
}  // 0ms runtime
