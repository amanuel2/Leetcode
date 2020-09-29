class Solution {
    public int maxProfit(int[] prices) {
        
        int max = 0;
        
        //Add up all the profits ONLY
        //Which should give you the
        //max profit.
        for(int i=0; i<prices.length-1; i++){
            if(prices[i] < prices[i+1]){
                max+=(prices[i+1]-prices[i]);
            }
        }
        
        return max;
    }
}