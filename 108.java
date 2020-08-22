class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null)
            return null;
        return sort(nums, 0, nums.length - 1);
    }

    public TreeNode sort(int[] nums, int start, int end) {
        if (start > end)
            return null;

        int mid = start + (end - start) / 2;

        TreeNode curr = new TreeNode(nums[mid]);
        curr.left = sort(nums, start, mid - 1);
        curr.right = sort(nums, mid + 1, end);

        return curr;
    }
}