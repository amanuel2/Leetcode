class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        //make a queue with a custom comparator
        Queue<Integer> queue = new PriorityQueue(new Comparator<Integer>(){
            //REVERSE since building MAX-HEAP
            //if it was MIN-HEAP would just be a - b
            public int compare(Integer a, Integer b){
                return b - a;
            }
        });
        
        //Add all the numbers inside queue
        //self-orders via rule defined above
        for(int i=0; i<nums.length; i++){
            queue.add(nums[i]);
        }
        
        //poll k times to find the 
        //kth largest item
        int max = 0;
        for(int i=0; i<k; i++) {
            max = queue.poll();
        }
        
        return max; 
    }
}