class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums == null || nums.length == 0) return false;
        if(nums.length == 1 || nums.length == 2) return false;
        
        int i = Integer.MAX_VALUE; //first
        int j = Integer.MAX_VALUE; //second
        
        for(int k=0; k<nums.length; k++){
            if(nums[k] < i) i = nums[k];
            else if(nums[k] < j && nums[k] > i) j = nums[k];
            else if(nums[k] > j) return true;
        }
        
        return false;
    }
}