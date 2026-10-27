class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        A = []
        for i, num in enumerate(nums):
            A.append([num, i])

        A.sort()
        result = []
        left = 0
        right = len(nums) - 1
        while left < right:
            if A[left][0]+A[right][0] > target:
                right-=1
            elif A[left][0]+A[right][0] < target:
                left+=1
            else:
                return[min(A[left][1], A[right][1]), max(A[left][1], A[right][1])]
        return result