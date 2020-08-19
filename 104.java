class Solution {
    public int maxDepth(TreeNode root) {
        return max(root);
    }

    public int max(TreeNode root) {
        if (root == null)
            return 0;
        int left = max(root.left);
        int right = max(root.right);
        return Math.max(left, right) + 1;
    }
}