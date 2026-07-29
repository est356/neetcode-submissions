class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int current;
        for (int i = 0; i < heights.length; i++) {
            int left = i;
            int right = heights.length-1;
            while (left < right) {
                current = (right - left) * Math.min(heights[left], heights[right]);
                if (current > max) {
                    max = current;
                }
                right--;
            }
        }
        return max;
    }
}
