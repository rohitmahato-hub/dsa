import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Sept25 {
    public static void main(String[] args) {
        String expression = "{a,b}{c,{d,e}}";
        List<String> res = braceExpansionII(expression);
        System.out.println(res);
    }
    public static List<String> braceExpansionII(String expression) {
        HashSet<String>set = helper(expression, 0, expression.length());
        List<String>ans = new ArrayList<>(set);
        Collections.sort(ans);
        return ans;
    }

    public static  HashSet<String> helper(String exp, int st, int end){
        HashSet<String>result = new HashSet<>();
        HashSet<String>curr = new HashSet<>();
        curr.add("");
        int i = st;
        while(i<end){
            char ch = exp.charAt(i);

            if(ch=='{'){
                int braces=1;
                int j = i+1;
                while(j<end && braces!=0){
                    if(exp.charAt(j)=='{'){
                        braces++;
                    }
                    else if(exp.charAt(j)=='}'){
                        braces--;
                    }
                    j++;
                }
                HashSet<String>tem = helper(exp, i+1, j-1);
                HashSet<String>tem2 = new HashSet<>();
                for(String m : curr){
                    for(String n : tem){
                        tem2.add(m+n);
                    }
                }
                curr = tem2;
                i=j;

            }
            else if(ch==','){
                result.addAll(curr);
                curr = new HashSet<>();
                curr.add("");
                i++;
            }
            else{
                HashSet<String>temp = new HashSet<>();
                for(String k : curr){
                    temp.add(k+ch);
                }
                curr = temp;
                i++;
            }
        }

        result.addAll(curr);
        return result;
    }
}



/*import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

class Solution {
    
    private TreeSet<String> resultSet = new TreeSet<>();

    public List<String> braceExpansionII(String expression) {
        dfs(expression);
        return new ArrayList<>(resultSet);
    }

    private void dfs(String exp) {
        
        int closeBraceIdx = exp.indexOf('}');
        
       
        if (closeBraceIdx == -1) {
            resultSet.add(exp);
            return;
        }
        
        int openBraceIdx = exp.lastIndexOf('{', closeBraceIdx);
        
        String prefix = exp.substring(0, openBraceIdx);
        String suffix = exp.substring(closeBraceIdx + 1);
        String[] options = exp.substring(openBraceIdx + 1, closeBraceIdx).split(",");
        
        for (String option : options) {
            dfs(prefix + option + suffix);
        }
    }
}*/
