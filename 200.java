class Solution {
    
    public int numIslands(char[][] grid) {
        //Loop through grid and search for 1
        int num = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j] == '1'){
                    num+=1;
                    dfs(grid,i,j);
                }
            }
        }
        
        return num; 
    }
    
    public void dfs(char[][] grid, int i, int j){
        //Base Case for recursion
        if(i<0 || i>=grid.length) return;
        if(j<0 || j>=grid[i].length) return;
        if(grid[i][j]=='0') return;
     
        //Set current adjacent element to 0
        grid[i][j] = '0';
        
        //Recursive Call
        dfs(grid, i+1, j); //bottom
        dfs(grid, i-1, j); //top
        dfs(grid, i, j-1); //left
        dfs(grid, i, j+1); //right
    }
}