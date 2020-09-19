class Solution {
    public int titleToNumber(String s) {
        Map<Character,Integer> map = setupMap();
        
        //A B C
        //(26^2 * CHAR_VALUE) + (26^1 * CHAR_VALUE) + (26^0 * CHAR_VALUE)
        //(26^2 * 1) + (26^1 * 2) + (26^2 * 3)
        
        int total = 0;
        int power = s.length()-1;
        for(int i=0; i<s.length();i++,power--){
            Character c = s.charAt(i);
            int val = map.get(c);
            
            total+= (Math.pow(26,power)*val);
        }
        
        
        return total;
    }
    
    //Easily setup mapping
    public Map<Character,Integer> setupMap(){
        Map<Character,Integer> map = new HashMap();
        Character[] chars = new Character[]{
          'A','B','C','D','E','F',
          'G','H','I','J','K','L',
          'M','N','O','P','Q','R','S',
          'T','U','V','W','X','Y','Z'
        };
        
        for(int i=1; i<chars.length+1; i++){
            map.put(chars[i-1], i);
        }
        return map;
    }
}