class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        
        //fill all of the row's first column with 1
        //|1,x,x,x,x,x,x,x,,x,x,x
        //|1,x,x,x,x,x,,x,x,x,x,x
        //|1,x,x,x,x,x,,x,x,x,x,x
        //|______________________
        for(int i=0; i<dp.length; i++){
            dp[i][0] = 1;
        }
        
        //fill all of the column's first row with 1
        // ______________________
        //|1,1,1,1,1,1,1,,1,1,1,1
        //|x,x,x,x,x,x,,x,x,x,x,x
        //|x,x,x,x,x,x,,x,x,x,x,x
        //|______________________
        for(int i=0; i<dp[0].length; i++){
            dp[0][i] = 1;
        }
        
        //Now start filling in the x's
        //with the left + the top 
        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        
        //finnaly return the right bottom edge!
        return dp[m-1][n-1];
    }
}