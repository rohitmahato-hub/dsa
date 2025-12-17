//#this is brute force apporach 
// public class Question10 {
//     public static void main(String[] args) {
//         int height[] = {1,8,6,2,5,4,8,3,7};
//         int maxWater = 0;
//         for(int i=0;i<height.length;i++){
//             for(int j=i+1;j<height.length;j++){
//                 int w = j-i;
//                 int ht = Math.min(height[i],height[j]);
//                 int area = w * ht;
//                 maxWater = Math.max(maxWater,area);
//             }
//         }
//        System.out.println(maxWater);
//     }
// }


//#Optimal approach or 2 pointer apporach
public class Question10 {
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        int maxWater = 0;
        int left = 0;
        int right = height.length-1;
        while(left < right){
            int w = right - left;
            int ht = Math.min(height[left],height[right]);
            int currWater = w * ht;
            maxWater = Math.max(maxWater,currWater);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        System.out.println(maxWater);
    }
}
