class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for (int r = 0; r < s.length(); r++) {
            if (map.containsKey(s.charAt(r))) {
                left = Math.max(map.get(s.charAt(r)) + 1, left);
            }
            map.put(s.charAt(r), r);
            max = Math.max(max, r - left + 1);
        }

        return max;
    }
}
