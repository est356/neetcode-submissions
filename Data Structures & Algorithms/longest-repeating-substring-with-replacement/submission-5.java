class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxf = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
            maxf = Math.max(maxf, map.get(s.charAt(i)));
            if (i - left + 1 - maxf > k) {
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            } 
            
            max = Math.max(max, i - left + 1);


        }

        return max;
    }
}
