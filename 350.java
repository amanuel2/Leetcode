class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length)
            return intersect(nums2, nums1); // Makes sure nums1 is greater
        Map<Integer, Integer> map = new HashMap();

        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> same = new ArrayList();
        for (int num : nums2) {
            int count = map.getOrDefault(num, 0);
            if (count > 0) {
                same.add(num);
                map.put(num, count - 1);
            }
        }

        int[] final_arr = new int[same.size()];
        int index = 0;
        for (int num : same)
            final_arr[index++] = num;

        return final_arr;
    }
}