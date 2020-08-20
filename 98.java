class Solution {
    boolean isVal;

    public boolean isValidBST(TreeNode root) {
        return isValid(root, null, null);
    }

    public boolean isValid(TreeNode root, Integer max, Integer min) {
        if (root == null)
            return true;
        else if (max != null && root.val >= max)
            return false;
        else if (min != null && root.val <= min)
            return false;

        boolean left = isValid(root.left, root.val, min);
        boolean right = isValid(root.right, max, root.val);

        return left && right; // only true if both subtrees are valid
    }
}