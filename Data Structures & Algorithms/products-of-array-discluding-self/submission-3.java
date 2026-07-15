class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] prefix = new int[length];
        int[] suffix = new int[length];
        int[] result = new int[length];

        int total = 1;
        prefix[0] = total;
        for (int i = 0; i < length - 1; i++) {
            total *= nums[i];
            prefix[i + 1] = total;
        }
        int total2 = 1;
        suffix[length - 1] = 1;
        for (int j = length - 2; j >= 0; j--) {
            total2 *= nums[j + 1];
            suffix[j] = total2;
        }
        
        for (int i = 0; i < length; i++) {
            result[i] = prefix[i] * suffix[i];
        }
        return result;
    }
}  
