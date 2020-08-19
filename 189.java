class Solution {

    // [4,9,3,1] 3 => (0 + 3)%4
    // [0,0,4,9,3,1]
    // Shift right k indexes
    public void rotate(int[] nums, int k) {
        if (k == 0)
            return;
        if (nums.length == 0 || nums.length == 1)
            return;
        int ret[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            ret[(i + k) % nums.length] = nums[i];
        for (int i = 0; i < nums.length; i++)
            nums[i] = ret[i];

    }
}