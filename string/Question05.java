import java.util.HashMap;

public class Question05 {
    public static void main(String[] args) {
        String s = "f11";
        String t = "b23";
        System.out.println(isIsomorphic(s,t));
    }
    public static boolean isIsomorphic(String s, String t) {
       HashMap<Character,Character> sToTMap = new HashMap<>();
       HashMap<Character,Character> tToSMap = new HashMap<>();
       StringBuilder sbS = new StringBuilder(s);
       StringBuilder sbT = new StringBuilder(t);

       for(int i=0;i<s.length();i++){
            char s1 = sbS.charAt(i);
            char t1 = sbT.charAt(i);

            if(!sToTMap.containsKey(s1)){
                sToTMap.put(s1,t1);
            }
            if(!tToSMap.containsKey(t1)){
                tToSMap.put(t1,s1);
            }

            if(sToTMap.get(s1)!=t1 || tToSMap.get(t1)!=s1){
                return false;
            }
        }
        return true;
    }
}

