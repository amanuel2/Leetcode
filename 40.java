class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        //Set for no repetitions
        Set<List<Integer>> opt = new HashSet();
        Arrays.sort(candidates);
        
        //magic function that solves all our problems :)
        magic(opt, candidates, target, new ArrayList(), 0);
        
        //finnaly add to list and return it
        List<List<Integer>> out = new ArrayList();
        out.addAll(opt);
        return out;
    }
    
    
    public void magic(Set<List<Integer>> opt, int[] candidates, int target, List<Integer> l, int idx){
        //if target was reduced to 0
        //then sum was found!
        if(target == 0){
            opt.add(new ArrayList(l));
            return;
        }
        
        //if less, then we just subtracting for no reason
        //INF loop
        if(target < 0) return;
        
        
        for(int i=idx; i<candidates.length; i++){
            //add the candidate and make a recurisve loop to the next candidate
            l.add(candidates[i]);
            magic(opt, candidates, target-candidates[i], l, i+1);
            l.remove(l.indexOf(candidates[i]));
        }
    }
}