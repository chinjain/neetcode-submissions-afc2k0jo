class Solution {
    public int trap(int[] height) {
        int totalWater = 0;
        int leftMax = height[0], rightMax = height[height.length - 1];
        int l = 0, r = height.length - 1;

        while(l < r){
            if(leftMax < rightMax){
                l++;
                leftMax = Math.max(leftMax, height[l]);
                totalWater += leftMax - height[l];
            }else{
                r--;
                rightMax = Math.max(rightMax, height[r]);
                totalWater += rightMax - height[r];
            }
        }
        return totalWater;
    }
}
