class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> sol = new ArrayList<List<String>>();

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] arr = new int[26];
            for (char c : str.toCharArray()) {
                arr[c - 'a']++;
            }
            String strArr = "";
            for (int i = 0; i < 26; i++) {
                strArr = strArr + Integer.toString(arr[i]) + " ";
            }
            if (map.containsKey(strArr)) {
                List<String> oldList = map.get(strArr);
                oldList.add(str);
                map.put(strArr, oldList);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(strArr, list);
            }
        }

        for (List<String> list : map.values()) {
            sol.add(list);
        }

        return sol;




    }
}
