public class Oct06 {
    public static void main(String[] args) {
      String s = "(((";
      System.out.println(Oct06.minAddToMakeValid(s)); 
    }
     public static int minAddToMakeValid(String s) {

        int open = 0;
        int additions = 0;

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if(ch == '(') {

                open++;

            } else {

                if(open > 0) {

                    open--;

                } else {

                    additions++;
                }
            }
        }

        return additions + open;
    }
}
