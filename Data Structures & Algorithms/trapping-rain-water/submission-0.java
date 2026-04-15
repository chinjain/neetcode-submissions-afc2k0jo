class Solution {
    public int trap(int[] height) {

        int waterReserved = 0;

        for(int i = 0; i < height.length; i++){
            int j = i;

            int leftMax = 0, rightMax = 0;

            while(j >= 0){
                leftMax = Math.max(leftMax, height[j]);
                j--;
            }

            j = i;

            while(j < height.length){
                rightMax = Math.max(rightMax, height[j]);
                j++;
            }

            waterReserved += Math.min(leftMax,rightMax) - height[i];
        }


        return waterReserved;
        
    }
}
