import java.math.BigInteger;


//Math problem
//If u divide a number by 5
//continously until it reaches lower
//than 0. add up all of the digits
//that were divided and those are the 
//trailing zeroes of its factorial
class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        
        while(n > 0){
            n/=5; 
            count+=n;
        }
        
        return count;
    }
    
}