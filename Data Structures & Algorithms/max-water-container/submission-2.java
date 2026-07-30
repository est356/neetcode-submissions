class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int current;
        int left = 0;
        int right = heights.length - 1;

        while (left < right) {
            current = (right - left) * Math.min(heights[left], heights[right]);
            if (current > max) {
                max = current;
            }
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}
