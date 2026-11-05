class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        min = 100
        max = 0
        profit = 0
        left = 0
        right = 1
        while left < right and right < len(prices):
            min = prices[left]
            max = 0
            while right < len(prices):
                if prices[right] > max:
                    max = prices[right]
                right += 1
            if max - min > profit:
                profit = max - min
            left+=1
            right = left + 1
        return profit