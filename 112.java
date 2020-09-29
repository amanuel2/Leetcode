/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        return inner(root, sum);
    }
    

    public boolean inner(TreeNode root, int sum){
        if(root == null){
            return false;
        } 
        
        if(root.left == null && root.right == null && sum-root.val == 0){
            return true;
        } else{
            return inner(root.left,sum-root.val) || inner(root.right,sum-root.val);
        }
        
    }
}