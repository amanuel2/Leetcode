class Solution {
    List<Integer> nums = new ArrayList<Integer>();

    public int minDiffInBST(TreeNode root) {
        Integer min = Integer.MAX_VALUE;
        inorder(root);
        for (int i = 1; i < nums.size(); i++)
            min = Math.min(min, (nums.get(i) - nums.get(i - 1)));
        return min;
    }

    public void visit(TreeNode root) {
        nums.add(root.val);
    }

    public void inorder(TreeNode root) {
        if (root == null)
            return;
        inorder(root.left);
        visit(root);
        inorder(root.right);
    }
}