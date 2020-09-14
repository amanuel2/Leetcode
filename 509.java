class Solution {
    //Store in a dp array
    int[] dp = new int[1000];
    public int fib(int n) {
        if(n == 0){
            return 0;
        } else if(n == 1){
            return 1;
        } else if(dp[n] != 0){
            //IMPORTANT
            //If its already stored
            //just return that value
            //no need to compute again
            return dp[n];
        }
        //If not stored in a dp array
        //store lower two childs
        dp[n-1] = fib(n-1);
        dp[n-2] = fib(n-2);
        
        //return their sum
        return dp[n-1]+dp[n-2];
    }
}