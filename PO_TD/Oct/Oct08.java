public class Oct08 {
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(Oct08.removeOuterParentheses(s));
    }
    public static String removeOuterParentheses(String s) {

        StringBuilder ans = new StringBuilder();
        int count = 0;

        for(char ch : s.toCharArray()){
            if(ch =='('){
                if(count > 0){
                    ans.append(ch);
                }
                count++;
            }
            else{
                count--;
                if(count > 0){
                    ans.append(ch);
                }
            }
        }

        return ans.toString();      
        
    }
}
