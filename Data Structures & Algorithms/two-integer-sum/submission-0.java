class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sol = new int[2];
        int difference = target - nums[0];
        sol[0] = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i]; 
            if (map.containsKey(diff) && map.get(diff) != i) {
                sol[0] = i;
                sol[1] = map.get(diff);
                break;
            } 
        }
        return sol;
        
    }
}
