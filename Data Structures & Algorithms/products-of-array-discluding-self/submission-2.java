class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int total = 1;
        boolean zero = false;
        boolean doubleZero = false;
        for (int i = 0; i < nums.length; i++) { 
            if (nums[i] != 0) {
                total *= nums[i];
            } else {
                if (zero) {
                    doubleZero = true;
                }
                zero = true;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (doubleZero) {
                output[j] = 0;
            } else if (nums[j] != 0 && zero) {
                output[j] = 0;
            } else if (nums[j] == 0) {
                output[j] = total;
            } else {
                output[j] = total / nums[j];
            }
        }

        return output;
    }
}  
