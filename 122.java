class Solution {
    public int maxProfit(int[] prices) {
        // [7, 1, 5, 3, 6, 4]
        int i = 0;
        int valley = prices[0];
        int peak = prices[0];
        int maxprofit = 0;
        while (i < prices.length - 1) {

            // System.out.println(prices[i] + ":" + prices[i+1]);
            while (i < prices.length - 1 && prices[i] >= prices[i + 1]) {
                i++;
            }
            valley = prices[i]; // 1
            while (i < prices.length - 1 && prices[i] <= prices[i + 1]) {
                i++;
            }
            // System.out.println(prices[i] + ":" + prices[i+1]);
            peak = prices[i]; //
            System.out.println(valley + ":" + peak);
            maxprofit += peak - valley;
        }
        return maxprofit;
    }
}