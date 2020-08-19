class Solution {
    public void moveZeroes(int[] nums) {
        int[] ret = new int[nums.length];
        int i = 0;
        for (int num : nums)
            if (num != 0)
                ret[i++] = num;
        i = 0;
        for (int num : ret)
            nums[i++] = num;
    }
}