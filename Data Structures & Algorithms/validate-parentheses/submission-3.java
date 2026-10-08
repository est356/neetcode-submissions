class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c.equals('(') || c.equals('{') || c.equals('[')) {
                stack.push(c);
            } else {
                if (c.equals(')') && (stack.isEmpty() || !stack.pop().equals('('))) {
                    return false;
                } else if (c.equals('}') && (stack.isEmpty() || !stack.pop().equals('{'))) {
                    return false;
                } else if (c.equals(']') && (stack.isEmpty() || !stack.pop().equals('['))) {
                    return false;
                }
                
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}
