import java.util.Arrays;
public class Question11 {
    public static void main(String[] args) {
        String[] str = {"flight","flow","flower",};
        System.out.println(longestCommonPrefix(str));
    }
    public static String longestCommonPrefix(String[] str){
        int n = str.length;
        Arrays.sort(str);
        char[]first = str[0].toCharArray();
        char[]last = str[n-1].toCharArray();
        int i = 0;
        while(i<first.length && i<last.length){
            if(first[i] != last[i]){
                break;
            }
            i++;
        }
        return str[0].substring(0,i);
    }
}
