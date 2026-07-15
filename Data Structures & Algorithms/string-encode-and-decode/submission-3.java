class Solution {

    public String encode(List<String> strs) {
        String result = "";
        for (String str : strs) {
            result += str.length();
            result += "#";
            result += str;
        }
        return result;

    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
  
        String length = "";
        int i = 0;
        while(i < str.length()) {
            int start = i;
            while (str.charAt(i) != '#') {
                i++;
            }
            int len = Integer.parseInt(str.substring(start, i));
            i++;
            list.add(str.substring(i, i+len));
            i+=len;
        }


        return list;
    }
}
