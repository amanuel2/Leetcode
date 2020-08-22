class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return sym(root.left, root.right);
    }
    
    public boolean sym(TreeNode left, TreeNode right){
        if(left == null || right == null) return left==right;
        
        if(left.val != right.val) return false;
        
        return sym(left.left, right.right) && sym(left.right, right.left);
    }
}