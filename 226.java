class Solution {
    public TreeNode invertTree(TreeNode root) {
        return invert(root);
    }

    public TreeNode invert(TreeNode root) {
        if (root == null)
            return null;
        TreeNode left = invert(root.left);
        TreeNode right = invert(root.right);

        root.right = left;
        root.left = right;

        return root;
    }
}