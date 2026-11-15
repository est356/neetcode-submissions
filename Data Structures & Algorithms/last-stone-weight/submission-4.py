import heapq

class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        stones = [-n for n in stones]
        heapq.heapify(stones)

        while len(stones) > 1:
            first = -heapq.heappop(stones)      
            second = -heapq.heappop(stones)
            if first == second:
                continue
            elif first > second:
                heapq.heappush(stones, -(first - second))
            elif second > first:
                heapq.heappush(stones, -(second - first))
        if stones:
            return -stones[0]
        else:
            return 0


