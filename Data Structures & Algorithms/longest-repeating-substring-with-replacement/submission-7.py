class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        freq = {}
        count = 0
        max_freq = 0
        max_length = 0;
        left = 0

        for right in range(len(s)):
            if s[right] not in freq:
                freq[s[right]] = 1
            else:
                freq[s[right]] += 1
            max_freq = max(freq.values())

            while 1 + right - left - max_freq > k:
                freq[s[left]] -= 1
                left += 1
                max_freq = max(freq.values())
            max_length = max(max_length, right - left + 1)
        return max_length
            
