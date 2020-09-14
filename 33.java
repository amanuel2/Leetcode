class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0 || nums == null) return -1;
        int pivot = findPivot(nums);
        
        int left = 0;
        int right = nums.length-1;
        
        if(target >= nums[pivot] && target <= nums[right]){
            left = pivot;
        } else{
            right = pivot - 1;
        }
        
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] < target){
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }
        
        
        return -1;
    }
    
    private int findPivot(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        
        while(left<right){
            int mid = left + (right-left)/2;
            if(nums[mid] > nums[right]){
                left = mid+1;
            } else{
                right = mid;
            }
        }
        
        return left;
    }
}