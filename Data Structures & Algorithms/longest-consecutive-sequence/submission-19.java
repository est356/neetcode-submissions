class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int longest = 1;
        int current = 1; 

        for (int i = 0; i < nums.length; i++) {
            current = 1;
            if (set.contains(nums[i] - 1)) {
                continue;
            } 
            while (set.contains(nums[i] + current)) {
                current++;
            }
            if (current > longest) {
                longest = current;
            }
        }

        return longest;
    }
}
