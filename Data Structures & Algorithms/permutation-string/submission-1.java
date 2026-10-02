class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left = 0;
        int right = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            if (map.containsKey(s1.charAt(i))) {
                map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
            } else {
                map.put(s1.charAt(i), 1);
            }
        }

        HashMap<Character, Integer> map2 = new HashMap<>();
        while (right < s2.length()) {
            if (map2.containsKey(s2.charAt(right))) {
                map2.put(s2.charAt(right), map2.get(s2.charAt(right)) + 1);
            } else {
                map2.put(s2.charAt(right), 1);
            }
            right++;
            if (right - left == s1.length()) {
                if (Objects.equals(map, map2)) {
                    return true;
                }

                map2.put(s2.charAt(left), map2.get(s2.charAt(left)) -1);
                if (map2.get(s2.charAt(left)) == 0) {
                    map2.remove(s2.charAt(left));
                }
                left++;
            }


            
        }

        return false;
    }
}
