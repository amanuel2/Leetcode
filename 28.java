class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty())
            return 0;
        int hay_size = haystack.length();
        int needle_size = needle.length();

        String curr;
        for (int i = 0; i < hay_size; i++) {
            if (i + needle_size > hay_size)
                break;
            curr = haystack.substring(i, i + needle_size);
            if (curr.equals(needle))
                return i;
        }

        return -1;
    }
}