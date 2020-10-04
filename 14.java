class Solution {
    public String longestCommonPrefix(String[] strs) {
        //Edge cases Leetcode tests
        if(strs == null) return "";
        if(strs.length == 0) return "";
        if(strs.length == 1) return strs[0];
        
        //Here finds the minimum subtring 
        int min_idx = findMin(strs);
        String main = strs[min_idx];
        
        //Amount of common characters
        int common = 0;
        boolean found = true;
        
        //Loops through minimum substring
        for(int i=0; i<main.length(); i++){
            
            //Loops through each string EXCEPT minimum(preserve time for non needed calculation)
            for(int j=0; j<strs.length; j++){
                if(j==min_idx) continue;
                
                //If at one point it doesnt equate then call it off!
                if(strs[j].charAt(common) != main.charAt(common)) found=false; 
            }
            
            //if it didnt equate break out of loop your done!
            if(!found) break;
            
            //else you have more common characters!
            common++;
        }
        
        
        
        return main.substring(0,common);
    }
    
    //Finds minimum length substring
    //So in ["dogs","racecar","car"]
    // returns the index of "car" since its smallest
    
    public int findMin(String[] strs){
        int min = 9999999; //could put Integer.max_val
        int index = 0;
        
        for(int i=0; i<strs.length; i++){
            String curr = strs[i];
            
            if(curr.length() < min){
                min = curr.length();
                index = i;
            }
        }
        
        return index;
    }
}