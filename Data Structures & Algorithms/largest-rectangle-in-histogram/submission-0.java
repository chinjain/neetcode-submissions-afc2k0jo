class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = Integer.MIN_VALUE;

        for(int i = 0; i < heights.length; i++){
            int h = heights[i];
            int left = i;
            int right = i;

            while(left >= 0 && heights[left] >= h)left--;
            while(right <= heights.length -1 && heights[right] >= h)right++;

            int width = right - left - 1;
            maxArea = Math.max(maxArea, width * h);
        }

        return maxArea;
    }
}
