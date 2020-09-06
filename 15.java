/**
 * Two pointer
 */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> opt = new HashSet();
        Arrays.sort(nums);
        
        
        for(int i=0; i<nums.length-2; i++){
            int target = -nums[i];
            int start = i+1;
            int end = nums.length-1;
            
            while(start<end){
                if(nums[start] + nums[end] == target){
                    opt.add(Arrays.asList(-target,nums[start],nums[end]));
                    start++;
                    end--;
                } else if(nums[start] + nums[end] < target){
                    start++;
                } else{
                    end--;
                }
            }
            
        }
        
        return new ArrayList(opt);
    }
}