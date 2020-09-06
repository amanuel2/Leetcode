class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length()==0) return s;
        if(s.length() == 1) return s;
        
        int start = 0;
        int end   = 0;
        for(int i=0; i<s.length(); i++){
            int first  = expandMiddle(s, i, i);
            int second = expandMiddle(s, i, i+1);
            int max = Math.max(first,second);
            if(max > (end-start)){
                start = i - ((max-1)/2);
                end   = i + (max/2);
            }
            System.out.println("start : " + (start+1));
        }
        
        return s.substring(start,end+1);
    }
    
    
    public int expandMiddle(String s, int l, int r){
        if(s.length() == 0 || l>r) return 0;
        
        while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        
        return r-l-1;
    }
        
}