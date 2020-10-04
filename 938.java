class Solution {
    private int add = 0;
    
    public int rangeSumBST(TreeNode root, int L, int R) {
        //go back in stack if null
        if(root == null) return 0;
        
        //if in range add to value
        if(root.val >= L && root.val <= R) add+=root.val;
        
        //Recursively go through left and right nodes
        rangeSumBST(root.left,L,R);
        rangeSumBST(root.right,L,R);
        
        //finnaly return the sum
        return add;
    }
}