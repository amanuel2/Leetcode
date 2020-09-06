class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> opt = new ArrayList();
        
        Map<String, List<String>> map = new HashMap();
        
        for(int i=0; i<strs.length; i++){
            String sorted = sortStr(strs[i]);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList());
            }
            
            map.get(sorted).add(strs[i]);
            
        }
        
        // Iterator it = map.entrySet().iterator();
        // while(it.hasNext()){
        //     Map.Entry pair = (Map.Entry)it.next();
        //     opt.add((List<String>)pair.getValue());
        // }
        opt.addAll(map.values());
        
        return opt;
    }
    
    
    public String sortStr(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}