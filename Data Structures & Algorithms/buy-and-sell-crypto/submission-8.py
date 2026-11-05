class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        min_list = []
        min_price = prices[0]
        for i in range(len(prices)):
            min_price = min(min_price, prices[i])
            min_list.append(min_price)
        
        max_price = 0
        for i in range(len(prices)):
            max_price = max(max_price, prices[i] - min_list[i])
        return max_price
        