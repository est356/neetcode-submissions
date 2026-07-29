class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int left;
        int right;
        int target;

        // SORT ARRAY FIRST
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            left = i + 1;
            right = nums.length-1;
            target = 0 - nums[i];
            while (left < right) {
                // increment left if duplicate
                while (nums[left] == nums[left - 1] && left - 1 != i) {
                    left++;
                }

                // decrement right if duplicate 
                while (right != nums.length-1 && nums[right] == nums[right+1]) {
                    right--;
                }

                if (left < right && nums[left] + nums[right] == target) {
                    List<Integer> trio = new ArrayList<>();
                    trio.add(nums[left]);
                    trio.add(nums[right]);
                    trio.add(nums[i]);
                    result.add(trio);
                    // List<Integer> sample = new ArrayList<>();
                    // sample.add(1);
                    // sample.add(1);
                    // sample.add(-2);
                    // if (trio == sample) {
                    //     System.out.println(left + " " + right + " " + i);
                    // }
                    left++;
                    right--;
                } else if (nums[left] + nums[right] > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        

        return result;                                                                                                                
    }
}
