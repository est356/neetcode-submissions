class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int[] leftMin = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            leftMin[i] = min;
        }
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] - leftMin[i] > max) {
                max = prices[i] - leftMin[i];
            }
        }

        return max;
        
    }
}
