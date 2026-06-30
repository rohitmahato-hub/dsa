import java.util.Arrays;

public class Question13 {
    public static void main(String[] args) {
        int[] position = {1,2,3,4,7};
        int m = 3;
        int res = maxDistance(position,m);
        System.out.println(res);
        
    }
     public static int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low = 1;
        int high = position[position.length - 1] - position[0];
        int ans = 0;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            if(canForce(position,m,mid)){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    } 
    
    private static boolean canForce(int[] position, int m, int force) {
        int count = 1;
        int lastPosition = position[0];
        for (int i = 1; i < position.length; i++) {
            if (position[i] - lastPosition >= force) {
                count++;
                lastPosition = position[i];
            }
        }
        return count >= m;
    }
}
