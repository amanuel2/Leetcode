class Solution {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        return recursive(root, L, R);
    }

    public TreeNode recursive(TreeNode root, int L, int R) {
        if (root == null)
            return null;
        else if (root.val < L)
            return recursive(root.right, L, R);
        else if (root.val > R)
            return recursive(root.left, L, R);

        root.left = recursive(root.left, L, R); // left side
        root.right = recursive(root.right, L, R); // right side
        return root; // return itself
    }
}