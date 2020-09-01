class Solution {
    //12
    //2,3
    public int countPrimes(int n) {
        boolean[] prime = new boolean[n];
        for(int i=0; i<n; i++){
            prime[i] = true;
        }
        
        for(int i=2; (i*i)<n; i++ ){
            if(prime[i]){
                for(int j=i; j*i<n;j++){
                    prime[i*j]=false;
                }
            }
        }
        
        int num=0;
        for(int i=2; i<n; i++){
            if(prime[i]) num++;
        }
        
        return num; //0&1
    }
    
    
    public boolean isPrime(int n){
        int m = (int) Math.sqrt(n);
        
        for(int i=m; i>1; i--){
            if(n%i==0) return false;
        }
        return true;
    }
}