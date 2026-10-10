class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        int middle = (left + right) / 2;
        for (int i = 0; i < nums.length; i++) {
            if (nums[middle] > target) {
                right = middle;
            } else if (nums[middle] == target) {
                return middle;
            } else {
                left = middle;
                right = nums.length;
            }
            middle = (left + right) / 2;
        }


        return -1;
    }
}
