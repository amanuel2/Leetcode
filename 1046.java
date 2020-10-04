class Solution {
    public int lastStoneWeight(int[] stones) {
        //Setup prioirty queue
        Queue queue = new PriorityQueue<Integer>( (a,b) -> b - a );
        
        //add everything into stones array
        for(int stone: stones) queue.add(stone);
        
        while(queue.size()>1){
            
            //poll the first and second largest
            //and from there add the diffrence
            int first = (Integer)queue.poll();
            int second = (Integer)queue.poll();
            
            if(first>second) queue.add(first-second);
            else if(second>first) queue.add(second-first);
        }
        
        //if empty 0, else return last element
        return queue.size()==0?0:(Integer)queue.poll();
    }
}