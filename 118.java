class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows==0) return new ArrayList();
        
        List<List<Integer>> list = new ArrayList();
        
        int size=0;
        List<Integer> l1 = Arrays.asList(new Integer[]{1});
        list.add(l1);
        
        for(int i=1; i<(numRows); i++, size++){
            List<Integer> inner = new ArrayList();
            inner.add(1);
            
            for(int j=1; j<=size; j++){
                inner.add(list.get(i-1).get(j-1) +  list.get(i-1).get(j));
            }
            
            inner.add(1);
            list.add(inner);
        }
            
            
        return list;
    }
}