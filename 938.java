class Solution {
    int range_sum = 0;

    public int rangeSumBST(TreeNode root, int L, int R) {
        recursive(root, L, R);
        return range_sum;
    }

    public void recursive(TreeNode root, int L, int R) {
        if (root != null) {
            if (root.val >= L && root.val <= R)
                range_sum += root.val;
            if (root.val > L)
                recursive(root.left, L, R);
            if (root.val < R)
                recursive(root.right, L, R);

        }

    }
}