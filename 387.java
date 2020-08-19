class Solution {
    public int firstUniqChar(String s) {
        // Set<Character> set = new HashSet(Arrays.asList(s.toCharArray()));
        int[] alpha = new int[26];

        for (char c : s.toCharArray()) {
            alpha[c - 'a'] += 1;
        }

        int index = 0;
        for (char c : s.toCharArray()) {
            if (alpha[c - 'a'] == 1)
                return index;
            index++;
        }

        return -1;
    }
}