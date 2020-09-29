class Solution {
    //Max itterations allowed
    final int MAX = 30; //Make this larger if need be
    
    
    public boolean isPowerOfTwo(int n) {
        return inner(n,0); //Inner Recursive
    }
    
    boolean bool = false; 
    public boolean inner(int n, int m){
        //If MAX Itterations reached leave function
        if(m > MAX) return false;
        
        //If target found then true!
        if(Math.pow(2,m) == n) bool = true;
        
        inner(n,m+1); //Keep incrementing exponent and coutner
        
        return bool;
    }
}