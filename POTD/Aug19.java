import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Aug19 {
    public static void main(String[] args) {
       int n = 3;
       int[][] reservedSeats = {{1,2},{1,3},{1,8},{2,6},{3,1},{3,10}}; 
       int res = maxNumberOfFamilies(n, reservedSeats);
       System.out.println(res);
    }
     public static int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int totalFamily = n * 2;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int[] seat : reservedSeats){
            int row = seat[0];
            int col = seat[1];
            map.putIfAbsent(row, new ArrayList<>());
            map.get(row).add(col);
        }
            for(List<Integer> bookedSeatsInRow : map.values()){
                totalFamily -= 2;
                boolean isLeftFree = true;
                boolean isRightFree = true;
                boolean isMiddleFree = true;
                for(int col: bookedSeatsInRow){
                    if(col >= 2 && col <= 5) isLeftFree = false;
                    if(col >= 6 && col<= 9) isRightFree = false;
                    if(col >= 4 && col <= 7) isMiddleFree = false;
                }
                if(isLeftFree && isRightFree){
                    totalFamily +=2;
                }else if(isLeftFree || isRightFree ||isMiddleFree){
                    totalFamily +=1;
                }
            }
            return totalFamily;
    }
}
