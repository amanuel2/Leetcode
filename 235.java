/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return inner(root,p,q);
    }
    
    public TreeNode inner(TreeNode root, TreeNode p, TreeNode q){
        if(root == null) return root;
        
        //If both p and q arent children of the 
        //current root, then return that root since
        //they split
        
        //they have to be either both less or greater than
        //so they dont split.
        if(p.val < root.val && q.val < root.val){
            return inner(root.left,p,q);
        } else if(p.val > root.val && q.val > root.val){
            return inner(root.right,p,q);
        } else{
            return root;
        }
    }
}