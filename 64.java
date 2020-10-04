//VERY SIMILAR TO UNIQUE PATHS in Leetcode
class Solution {
    public int minPathSum(int[][] grid) {
        
        //normal dp array
        int[][] dp = new int[grid.length][grid[0].length];
        
        //Loop through each cell
        for(int i=0; i<dp.length;i++){
            for(int j=0; j<dp[i].length; j++){
                
                //first add in the current 
                //price you have to pay
                dp[i][j]+=grid[i][j];
                
                //now check for the last MINIMUM spot you CAME from
                //all these if statements to avoid corners
                if(i>0 && j>0)
                    dp[i][j]+=Math.min(dp[i-1][j], dp[i][j-1]);
                else if(i>0)
                    dp[i][j]+=dp[i-1][j];
                else if(j>0)
                    dp[i][j]+=dp[i][j-1];
            }
        }
        
        //the last minimum sum is the one at the very end obviously
        return dp[dp.length-1][dp[0].length-1];
    }
}