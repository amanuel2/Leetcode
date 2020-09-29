class Solution {
    public boolean exist(char[][] board, String word) {
        
        //if 1 by 1 block and that is char just return true
        if(board.length == 1 && board[0].length == 1 
           && word.length() == 1 && board[0][0] == word.charAt(0))
            return true;
        
        
        //Here we attempt to find first char
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                //If we find and the dfs is good then we got it!
                if(board[i][j] == word.charAt(0) && dfs(board,word,i,j,0)){
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public boolean dfs(char[][] board, String word, int i, int j, int count){
        //Check if in bound
        //and if we got our word!
        if(i>=board.length || i<0) return false;
        if(j>=board[i].length || j<0) return false;
        if(count == word.length()) return true;
        
        //if this is not it, then fall back in recursion stack
        if(board[i][j] != word.charAt(count)) return false;
        
       
        //Make sure only unique chars
        char tmp = board[i][j];
        board[i][j] = '/';
        
        //Here loop through each 4 directions (up,down,left,right)
        //and check if we have the word
        boolean found = dfs(board,word,i+1,j,count+1) 
                        || dfs(board,word,i-1,j,count+1)
                        || dfs(board,word,i,j+1,count+1) 
                        || dfs(board,word,i,j-1,count+1);
        
        //restore our char and return if we found the word
        board[i][j] = tmp;
        
        return found;
    }
}