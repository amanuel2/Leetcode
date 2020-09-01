class Solution {
    public int maxSubArray(int[] nums) {

        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0]+nums[1], Math.max(nums[1], nums[0]));
        

        
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0]+nums[1], nums[1]);
        int max = Math.max(dp[0], dp[1]);

        for(int i=2; i<nums.length; i++){
            dp[i] = Math.max(dp[i-1]+nums[i], nums[i]);
            if(dp[i]>max) max = dp[i];
        }
        
        
        return max;
    }
}