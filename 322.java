//https://www.youtube.com/watch?v=IqAdhHpRu3Y&ab_channel=AndreyGrehov
class Solution {
    public int coinChange(int[] coins, int amount) {
        //DP Initalization
        int[] dp = new int[amount+1];
        Arrays.fill(dp, 999999);
        
        //Base case
        dp[0] = 0;
        
        //Transition function begins
        for(int i=1; i<=amount; i++){
            for(int coin : coins){
                //Make sure you can take the coin out first
                //you cant take out coin of 3 for amount 2
                if(i-coin>=0){
                    //If it can find the minimum between this minimum path FOR NOW
                    //and the current amount minus coin
                    //+1 which simulates TAKING the coin out
                    dp[i] = Math.min(dp[i],1+dp[i-coin]);
                }
            }
        }
        
        return dp[amount]==999999?-1:dp[amount];
    }
}

// dp[i] = dp[i-1] + dp[i-2] + dp[i-5]