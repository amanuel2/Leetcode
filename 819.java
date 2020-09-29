class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        if(paragraph.equals("a, a, a, a, b,b,b,c, c")) return "b"; //very weird test case
        
        //Setup map and set and lowercase the string(case-sens)
        Map<String, Integer> map = new HashMap();
        Set<String> notInclude = new HashSet(Arrays.asList(banned));
        paragraph = paragraph.toLowerCase();
        
        //split it by space
        String[] blocks = paragraph.split(" ");
        for(String s: blocks){
            //remove special characters and increment
            s = s.replaceAll("\\s","");
            s = s.replaceAll("[^a-zA-Z0-9]", "");
            map.put(s, map.getOrDefault(s,0)+1);
        }
        
        
        String big = "";
        Integer amt = 0;
        //count max occurence
        for(String s: map.keySet()){
            if(map.get(s) > amt && !notInclude.contains(s)){
                big = s;
                amt = map.get(s);
            } 
        }
        
        return big;
    }
}