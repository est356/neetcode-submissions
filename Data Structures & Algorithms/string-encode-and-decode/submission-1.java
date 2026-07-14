class Solution {

    public String encode(List<String> strs) {
        String result = "";
        for (String str : strs) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                result += (int) c;
                result += " ";
            }
            result += " 00 ";
        }
        System.out.println(result);
        return result;
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(str);
        while (scanner.hasNext()) {
            String entry = "";
            int next = scanner.nextInt();
            while (next != 00) {
                entry += (char) next;
                //System.out.println(entry);
                next = scanner.nextInt();
            }
            list.add(entry);
        }


        return list;

    }
}
