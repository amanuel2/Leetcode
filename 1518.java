class Solution {
    int numDrink=0;
    public int numWaterBottles(int numBottles, int numExchange) {
       int numEmpty=0;
         int numDrink=numBottles;
         int totalDrinked=numBottles;
        while(numDrink>0){
            numDrink=numBottles/numExchange;
            numEmpty = numBottles%numExchange;
            numBottles = numDrink + numEmpty;
            totalDrinked+=numDrink;
        }
        
        return totalDrinked;
    }
}
