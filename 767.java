class Solution {
    public String reorganizeString(String S) {
        
        //Use hashmap to store # of occurences
        Map<Character,Integer> map = new HashMap();
        for(char c: S.toCharArray()) map.put(c,map.getOrDefault(c,0)+1);
        
        //Use prioirty queue's to add the most occuring characters
        //to front of list, and the least to the back
        Queue queue = new PriorityQueue<Character>( (a,b) -> map.get(b) - map.get(a));
        for(Character c: map.keySet()) queue.add(c);
        
        //Now loop until queue size is less than or equal to 1
        StringBuilder result = new StringBuilder("");
        while(queue.size() > 1){
            //GREEDY APPROACH
            //poll the first and next char
            Character curr = (Character) queue.poll();
            Character next = (Character) queue.poll();
            
            //First append to the result to be returned later
            result.append(curr);result.append(next);
            
            //decrement their occurence from map
            map.put(curr, map.get(curr)-1);
            map.put(next, map.get(next)-1);
            
            //if they are 0, dont add it back to the heap
            //since no more instances of that character
            //else add it
            if(map.get(curr) > 0) queue.add(curr);
            if(map.get(next) > 0) queue.add(next);
        }
        
        //if queue size is 1, it must be
        //dangling between a character
        if(queue.size() == 1){
            //poll the last character
            Character last = (Character) queue.poll();
            //if that occurence is more than 1, then it must be
            //un-proportinate to the other characters so return 
            //null/empty string in this case
            if(map.get(last) > 1) return "";
            
            //otherwise add last char
            result.append(last);
        }
            
        return new String(result);
    }
}