class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] inner_num = new int[101];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += inner_num[nums[i]];
            inner_num[nums[i]]++;
        }
        return count;
    }
}