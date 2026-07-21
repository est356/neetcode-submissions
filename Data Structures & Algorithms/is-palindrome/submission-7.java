class Solution {
    public boolean isPalindrome(String s) {
        int end = s.length() - 1;
        for (int i = 0; i < s.length() - 1; i++) {
            while (i < s.length() - 1 && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            } 
            while (end > 0 && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            if (Character.isLetter(s.charAt(i)) && Character.isLetter(s.charAt(end))) {
                if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(end))) {
                    return false;
                }
            } else if (Character.isLetterOrDigit(s.charAt(i)) && Character.isLetterOrDigit(s.charAt(end)) && s.charAt(i) != s.charAt(end)) {
                return false;
            }
            end--;
        }

        return true;
    }
}
