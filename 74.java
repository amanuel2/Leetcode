class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //Edge Cases
        if(matrix == null || matrix.length == 0) return false;
        
        for(int i=0; i<matrix.length; i++){
            //If length of 0 just skip it
            if(matrix[i].length==0) continue;
            
            //Check if in range
            if(target >= matrix[i][0] && target <= matrix[i][matrix[i].length-1]){
                
                //If in range do a simple binary search for the value
                int[] arr = matrix[i].clone();
                int left = 0;
                int right = matrix[i].length-1;
                
                while(left <= right){
                    int mid = left + (right-left)/2;
                    if(arr[mid] == target){
                        return true;  
                    } else if(arr[mid] < target){
                         left = mid + 1;
                    } else{
                         right = mid - 1;
                    }
                }
                
            }
            
        }
        
        return false;
    }
}