class Solution {
    public List<Integer> partitionLabels(String S) {
        //ababcbacadefegdehijhklij
        
        //last time each character occured set
        int[] alphabet = new int[26];
        for(int i=0; i<S.length(); i++)
            alphabet[S.charAt(i)-'a'] = i;
        
        //start and end of partition
        int start = 0;
        int end = 0;
        List<Integer> output = new ArrayList();
        for(int i=0; i<S.length(); i++){
            //make sure end is after the start of partition
            end = Math.max(end, alphabet[S.charAt(i)-'a']);
            
            //if the current itteration is the last place where character is seen
            //jackpot
            if(i==end){
                output.add(end-start+1);
                //reset start to go further in partition
                start = end+1;
            }
        }
        
        return output;
    }
}