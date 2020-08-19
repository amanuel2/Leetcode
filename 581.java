class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        int indexStart = nums.length, indexEnd = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != sorted[i]) {
                indexStart = Math.min(indexStart, i);
                indexEnd = Math.max(indexEnd, i);
            }
        }
        return (indexEnd - indexStart + 1 >= 0 ? indexEnd - indexStart + 1 : 0);
    }
}