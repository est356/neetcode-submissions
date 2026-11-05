class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if s == "":
            return 0
        seen = set()
        maxLen = 1

        left = 0
        right = 1
        seen.add(s[left])
        while left <= right and right < len(s):
            if s[right] not in seen:
                seen.add(s[right])
                right += 1
                maxLen = max(maxLen, right - left)
            while right < len(s) and s[right] in seen:
                seen.discard(s[left])
                left += 1
        return maxLen