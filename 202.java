class Solution {
    
    //setup constant variables
    int max_itter = 20; //change this to ur liking. (lower = faster)
    boolean bool = false;
    
    public boolean isHappy(int n) {
        return recur(digits(n));
    }
    
    
    public boolean recur(int[] nums){
        int num = 0;
        //add up each number
        for(int _num: nums){
            num+= (int)(Math.pow(_num,2));
        }
        
        //if 1 then true
        if(num == 1){
            bool = true;
            return bool;
        }
        
        //if max itterations didnt reach
        //0 then keep on with recursion.
        //this max is modifiable via line #4
        max_itter--;
        if(max_itter!=0)
            recur(digits(num));
        
        return bool;
    }
    
    public int[] digits(int num){
        //total num of digits at first
        int num_digits = (int)Math.log10(num)+1;
        int[] arr = new int[num_digits];
        
        for(int i=num_digits-1; i>=0; i--){
            //tmp divisor
            int tmp = num/((int)Math.pow(10,i));
            //add in reverse, as well as in the array
            arr[(num_digits-1) -i] = tmp%(10);
        }
        return arr;
    }
}