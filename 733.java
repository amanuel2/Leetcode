class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        //If already exists then return
        if(image[sr][sc] == newColor) return image;
        
        //start dfs
        fill(image, sr, sc, image[sr][sc], newColor);
        return image;
    }
    
    
    public void fill(int[][] image, int sr, int sc, int oldColor, int newColor){
        //if out of bounds or if its not the same color back out
        if(sr<0 || sr >= image.length || sc<0 || sc >= image[0].length || image[sr][sc] != oldColor)
            return;
        
        image[sr][sc] = newColor;
            
        //Color all 4 parts(up,down,left,right)
        fill(image,sr+1,sc,oldColor,newColor);
        fill(image,sr-1,sc,oldColor,newColor);
        fill(image,sr,sc+1,oldColor,newColor);
        fill(image,sr,sc-1,oldColor,newColor);
    }
}