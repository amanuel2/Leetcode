class Solution {
    public String toLowerCase(String str) {
        String res = new String();
        for (char c : str.toCharArray()) {
            if (c >= 65 && c <= 90)
                c += 32;
            res += c;
        }
        return res;
    }
}