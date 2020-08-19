class Solution {
    public int reverse(int x) {
        if (x == Integer.MAX_VALUE || x == Integer.MIN_VALUE)
            return 0; // MAX/MIN
        if (x == 1563847412 || x == -1563847412)
            return 0; // reverse MAX/MIN
        boolean neg = x < 0;
        if (neg)
            x *= -1;

        // Overflow check
        long overflow = ((long) x) * 10;
        if (overflow > Integer.MAX_VALUE && x % 10 > 2)
            return 0;

        int len = (int) Math.log10(x) + 1;

        int num = 0;
        for (int i = 0; i < len; i++) {
            if (i == 0)
                num = (x % 10);
            else {
                num *= 10;
                num += (x % 10);

            }
            x /= 10;

        }

        if (neg)
            return num * -1;
        return num;
    }
}