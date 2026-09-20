public class Sept20 {
    public static void main(String[] args) {
        String s = "abc";
        int res = reverseDegree(s);
        System.out.println(res);
    }
     public static int reverseDegree(String s) {
        int reverseDegreeSum = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            int reversedValue = 26 - (c - 'a');
            
            int stringPosition = i + 1;
            
            reverseDegreeSum += (reversedValue * stringPosition);
        }
        
        return reverseDegreeSum;
    }
}
