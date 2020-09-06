//[1,4,6,7,8]
// 1 4 6 7,YES => go to map return index 2(4) + index of curr;
//Map [1:1, 2:4, 3:6, 4:7]
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (map.containsKey(comp)) {
                return new int[] { map.get(comp), i };
            }
            map.put(nums[i], i);
        }

        return new int[2];
    }
}