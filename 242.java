class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] alpha = new int[26];
        int[] alpha2 = new int[26];

        for (char c : s.toCharArray())
            alpha[c - 'a'] += 1;
        for (char c : t.toCharArray())
            alpha2[c - 'a'] += 1;

        for (int i = 0; i < 26; i++) {
            if (alpha[i] != alpha2[i])
                return false;
        }

        return true;
    }
}
