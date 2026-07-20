class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int current = 1;
        int longest = 1;
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length - 1; i++) { 
            if (nums[i+1] == nums[i]) {
                continue;
            }
            if (nums[i+1] - nums[i] == 1) {
                current++;
            } else {
                current = 1;
            }

            if (current > longest)  {
                longest = current;
            }
        }

        return longest;
    }
}
