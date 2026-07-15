class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];

        for (int i = 0; i < output.length; i++) {
            int result = 1;
            for (int j = 0; j < output.length; j++) {
                if (j != i) {
                    result *= nums[j];
                }
            }
            output[i] = result;
        }

        return output;
    }
}  
