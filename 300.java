
// Go to solutions/dynamic programming to see how its done
//
// https://leetcode.com/problems/longest-increasing-subsequence/solution/

class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        
        Integer[] dp = new Integer[nums.length];
        dp[0] = 1;
        
        for(int i=0; i<nums.length; i++){
            int max = 0;
            for(int j=0; j<i; j++){
                if(nums[i] > nums[j]){
                    max = Math.max(max,dp[j]);
                }
            }
        
            dp[i] = max + 1;
        }
        
        return Collections.max(Arrays.asList(dp));
    }
}