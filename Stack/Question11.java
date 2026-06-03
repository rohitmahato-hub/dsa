public class Question11 {
    public static void main(String[] args) {
       int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
       int res = trap(height);
       System.out.println(res);
    }
     public static  int trap(int[] height) {

        int n = height.length;
        int totalWater = 0;

        int leftMax = 0;
        int rightMax = 0;

        int start = 0;
        int end = n - 1;

        while (start < end) {

            leftMax = Math.max(leftMax, height[start]);
            rightMax = Math.max(rightMax, height[end]);

            if (leftMax < rightMax) {

                totalWater += leftMax - height[start];
                start++;

            } else {

                totalWater += rightMax - height[end];
                end--;
            }
        }

        return totalWater;
    }
}
