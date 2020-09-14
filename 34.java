class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0 || nums == null) return new int[]{-1,-1};
        
        //Start binary search
        int left = 0;
        int right = nums.length-1;
        int index = 0;
        
        //Try to find target
        while(left<right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                index = mid;
                break;
            } else if(nums[mid] > target){
                right = mid;
            } else{
                left = mid+1;
            }
        }
        
        //before checking for target index
        //if left is target set to it
        //this avoids certain edge cases
        if(nums[left] == target) index = left;
        
        //check if number exists
        if(nums[index] != target) return new int[]{-1,-1};
        
        //go back to the first instance of the target
        for(int i=index; i>=0; i--){
            if(nums[i]!=target) break;
            index = i;
        }
        
        //go forward to the last instance of the target
        int last_index = index;
        for(int i=last_index; i<nums.length; i++){
            if(nums[i]!=target) break;
            last_index = i;
        }
        
        //finnaly return the indices
        return new int[]{index,last_index};
    }
}