class Solution {
    
    //Idea is to sort the strings
    //to group the anograms
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> opt = new ArrayList();
        Map<String, List<String>>  map = new HashMap();
        
        //loop through each string
        for(String str: strs){
            String sorted = sortStr(str);
            
            //if the sorted key is not contained start a new list
            //and then add the non-sorted string
            if(!map.containsKey(sorted)) map.put(sorted, new ArrayList());
            map.get(sorted).add(str);
        }
        
        //finnaly add all and return
        opt.addAll(map.values());
        return opt;
    }
    
    //just sorts a string
    public String sortStr(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}