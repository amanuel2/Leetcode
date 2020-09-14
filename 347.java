class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == k) return nums;
         
        //Initate map
        Map<Integer,Integer> map = new HashMap();
        
        
        // setup
        // element : count of element
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);    
        }
        
        
        //make a queue with a custom comparator
        Queue<Integer> queue = new PriorityQueue(new Comparator<Integer>(){
            //REVERSE since building MAX-HEAP
            //if it was MIN-HEAP would just be a - b
            public int compare(Integer a, Integer b){
                return map.get(b) - map.get(a);
            }
        });

        
        //Loop through map add to queue
        for(int n: map.keySet()){
            queue.add(n);
        }
        
        
        //Poll them, and will keep removing
        //max number since its a max heap
        int[] arr = new int[k];
        for(int i=0; i<k; i++){
            arr[i] = queue.poll();
        }
        
        //return arr
        return arr;
    }
}