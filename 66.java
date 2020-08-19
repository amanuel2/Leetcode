class Solution {
    public int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1] += 1;
            return digits;
        } else if (digits[0] == 9) {
            int[] arr = new int[digits.length + 1];
            arr[0] = 1;
            int i = 1;
            for (int num : digits)
                arr[i] = num;
            arr[1] = 0;
            return arr;
        } else {
            int len = digits.length;
            for (int i = len - 1; i >= 0; i--) {
                if (digits[i] == 9)
                    digits[i] = 0;
                else {
                    digits[i] += 1;
                    return digits;
                }
            }
            return null;
        }
    }
}