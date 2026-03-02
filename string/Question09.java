import java.util.HashMap;

public class Question09{
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInteger(s));
    }
    public static int romanToInteger(String s) {

        HashMap<Character, Integer> hm = new HashMap<>();

        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int result = hm.get(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {

            if (hm.get(s.charAt(i)) < hm.get(s.charAt(i + 1))) {
                result = result - hm.get(s.charAt(i));   // subtract
            } else {
                result = result + hm.get(s.charAt(i));   // add
            }
        }

        return result;
    }
}