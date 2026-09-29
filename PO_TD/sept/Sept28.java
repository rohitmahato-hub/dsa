public class Sept28 {
    public static void main(String[] args) {
       String s = "(1+(2*3)+((8)/4))+1";
       System.out.println(new Sept28().maxDepth(s)); 
    }
    public int maxDepth(String s) {
        int ans = 0, depth = 0;
        for (char ch : s.toCharArray()) {
            depth += ch == '(' ? 1 : ch == ')' ? -1 : 0;
            ans = Math.max(ans, depth);
        }
        return ans;
    }
}

// import java.util.Stack;

// class Solution {
//     public int maxDepth(String s) {

//         Stack<Character> st = new Stack<>();
//         int max = 0;

//         for(char ch : s.toCharArray()){
//             if(ch == '('){
//                 st.push(ch);
//                 max = Math.max(max, st.size());
//             }
//             else if(ch == ')'){
//                 st.pop();
//             }
//         }

//         return max;
//     }
// }
