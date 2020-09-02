class Solution {
    public int hammingDistance(int x, int y) {
       //0001
       //0100
        int count=0;
        while(x>0 || y>0){
            count += (x%2) ^ (y%2);
            x>>=1;
            y>>=1;
        }
        
        return count;
    }
}