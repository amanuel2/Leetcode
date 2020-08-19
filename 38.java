/*
1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
 1.     1
 2.     11
 3.     21
 4.     1211
 5.     111221 
 6.     312211
 7.     13112221
 8.     1113213211
 9.     31131211131221
10.     13211311123113112211

*/

class Solution {

    public String countAndSay(int n) {
        String str = new String("1");

        while (--n != 0) {
            String ns = new String();
            for (int i = 0; i < str.length();) {
                // i modified here

                int j = i;
                int count = 1;
                char c = str.charAt(j); // charcater to be repeated

                while ((j + 1) < str.length() && str.charAt(j) == str.charAt(j + 1)) { // (j+1)<length;
                    j++;
                    count++;
                }
                ns += (String.valueOf(count));
                ns += (c);

                i += count;

            }
            System.out.println(ns);
            str = ns;
        }

        return str;
    }

}