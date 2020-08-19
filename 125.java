class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0)
            return true;
        if (s == null)
            return false;

        int i = 0;
        int j = s.length() - 1;
        while (i < s.length()) {

            if (!isAlphaNumeric(s.charAt(i))) {
                i++;
                continue;
            } else if (!isAlphaNumeric(s.charAt(j))) {
                j--;
                continue;
            }

            if ((toLowerCase(s.charAt(i)) != toLowerCase(s.charAt(j))))
                return false;

            i++;
            j--;
        }

        return true;
    }

    public boolean isAlphaNumeric(char c) {
        return ((c >= 'a') && (c < 'z')) || ((c >= 'A') && (c < 'Z')) || ((c >= '0') && (c <= '9'));
    }

    public char toLowerCase(char c) {
        if ((c >= 'A') && (c <= 'Z'))
            return (char) (c + 32);
        return c;
    }
}