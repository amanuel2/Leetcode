class Solution {
    int[] arr;
    int[] original;
    Random rand = new Random(System.currentTimeMillis());
    
    public Solution(int[] nums) {
        this.arr      = nums;
        this.original = nums.clone();  
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        arr = original;
        original = original.clone();
        return original;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        
        // for(int i=0; i<arr.length; i++){
        //     arr = swap(arr,i,randRange(0, arr.length));
        // }
        for(int i=0; i<arr.length; i++){
            int rand1 = rand.nextInt(arr.length);
            arr = swap(arr,i,rand1);
        }
        
        return arr;
    }
    
    public int[] swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
    
    public int randRange(int min, int max){
        return rand.nextInt(max-min)+min;   
    }
    
}