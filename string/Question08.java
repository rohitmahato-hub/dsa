public class Question08 {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }
    public  static int maxDepth(String s) {
        int res = 0;
        int curr = 0;

        for(int i = 0; i < s.length(); ++i){
            if(s.charAt(i) == '('){
                res = Math.max(res, ++curr);
            }
            else if(s.charAt(i) == ')'){
                curr--;
            }
        }
        return res;
    }
}
