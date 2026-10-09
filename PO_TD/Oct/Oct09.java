public class Oct09{
    public static void main(String[] args) {
        String s = "())";
        System.out.println(Oct09.minimumInsertions(s));
    }
    public static int minimumInsertions(String s){
        int insertions = 0;
        int reqClose = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                if(reqClose % 2 != 0){
                   insertions++;
                   reqClose--;
                }
                reqClose += 2;
            }else{
                reqClose--;
                if(reqClose > 0){
                    insertions++;
                    reqClose = 1;
                }
            }
        }
        return insertions + reqClose;
    }
}