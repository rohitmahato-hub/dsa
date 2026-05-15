public class Question16 {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

        System.out.println(strStr(haystack, needle));
    }
    public static int strStr(String haystack, String needle) {
    //    int n = haystack.length();
    //    int m = needle.length();
    //    for(int i = 0; i <= n-m;i++){
    //     int j = 0;
    //     while(j<m && haystack.charAt(j+i) == needle.charAt(j)){
    //         j++;
    //     }
    //     if(j == m){
    //         return i;
    //     }
    //    }
    //    return -1;


    //another apporachh
     for(int i=0;i<haystack.length()-needle.length()+1;i++){
        if(haystack.charAt(i) == needle.charAt(0)){
           if(haystack.substring(i,needle.length() +i).equals(needle)){
            return i;
           }
        }
    }
    return -1;
    }
}
