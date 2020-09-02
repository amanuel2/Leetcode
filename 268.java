//First way
class Solution {
    public int missingNumber(int[] nums) {
        
        Set<Integer> set = new HashSet();
        
        for(int num: nums) set.add(num);
        
        for(int i=0; i<=nums.length; i++) if(!set.contains(i)) return i;
        
        return 0;
    }
}

//Second way using Gauss
// Total Sum of Numbers from 1-n = n(n+1)/2
class Solution {
    public int missingNumber(int[] nums) {
        int total = 0;
        for(int num: nums) total+=num;

        return ((nums.length)*(nums.length+1))/2 - total;
    }
}