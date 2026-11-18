public class Nov18{
    public static void main(String[] args) {
        String s = "1001";
        System.out.println(minChanges(s));
    }
    public static int minChanges(String s){
        int changes = 0;
        for(int i =0;i<s.length()-1;i += 2){
            if(s.charAt(i) != s.charAt(i+1)){
                changes += 1;
            }
        }
        return changes;
    }
}