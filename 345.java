class Solution {
    Set<Character> vowels = new HashSet();
    public String reverseVowels(String s) {
        
        //Setup vowels first
        setupVowels(vowels);
        
        //Get Vowels reversed in a string
        String reversed_str = getReversedVowels(s);
        
        //Array that will contain the final value
        char[] new_arr = new char[s.length()];
        
        //index is for the actual index and index_reversed
        //index where the reversed strnig is
        int index = 0,index_reversed=0;
        for(char c: s.toCharArray()){
            if(vowels.contains(c)){
                //current reversed vowel
                Character rever = new Character(reversed_str.charAt(index_reversed));
                new_arr[index] = rever;
                index_reversed++;
            } else{
                new_arr[index] = c;
            }
            index++;
        }
          
        return String.valueOf(new_arr);
    }
    
    //Put all vowels in a set in reversed order
    public String getReversedVowels(String s){
        String res = new String();
        for(Character c : s.toCharArray()){
            if(vowels.contains(c)) res+=c;
        }
        
        return new String(new StringBuilder(res).reverse());
    }
    
    
    //Setup vowels for this question
    public void setupVowels(Set<Character> vowels){
        vowels.add('a');
        vowels.add('A');
        vowels.add('e');
        vowels.add('E');
        vowels.add('i');
        vowels.add('I');
        vowels.add('o');
        vowels.add('O');
        vowels.add('u');
        vowels.add('U');
    }
}