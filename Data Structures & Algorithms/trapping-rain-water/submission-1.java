class Solution {
    public int trap(int[] height) {
        int total = 0;
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int lmax = 0;
        int rmax = 0;

        for (int i = 0; i < height.length - 1; i++) {
            if (height[i] > lmax) {
                lmax = height[i];
            }
            if (height[height.length - i - 1] > rmax) {
                rmax = height[height.length-i-1];
            }
            left[i + 1] = lmax;
            right[height.length-i-2] = rmax;

        }

        for (int i = 0; i < height.length; i++) {
            int chunk = Math.min(left[i], right[i]) - height[i];
            if (chunk < 0) {
                chunk=0;
            }
            total+=chunk;
        }

        return total;
    }
}
