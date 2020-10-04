class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> out = new ArrayList();
        //magic function solves all problem :)
        magic(out, nums, new ArrayList(), 0);
        
        return out;
    }
    
    
    public void magic(List<List<Integer>> list, int[] nums, List<Integer> curr, int index){
        
        //Add current subset
        list.add(new ArrayList(curr));
        
        
        //Recrusion stack
        for(int i=index; i<nums.length; i++){
            //add the current number to current subset
            curr.add(nums[i]);
            //go to the next index
            magic(list,nums,curr,i+1);
            //remove the number from current subset
            curr.remove(curr.size()-1);
        }
        
    }
}