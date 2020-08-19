class Solution {
    public boolean canJump(int[] nums) {

        int activeIndex = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= activeIndex) {
                activeIndex = i;
            }
        }

        return activeIndex == 0;
    }
}