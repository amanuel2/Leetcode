class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp, 101010101);
        
        dp[0] = 0;
        for(int i=1; i<=amount; i++){
            for(int coin: coins){
                if(i >= coin){
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }
        
        return dp[amount] == 101010101 ? -1 : dp[amount];
    }
}