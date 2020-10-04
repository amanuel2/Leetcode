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
    public int max = 1;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0; 
        
        //magic function to solve all issues :)
        magic(root); 
        
        return max-1; 
    }
    
    public int magic(TreeNode root){
        //if null fall back in stack
        if(root == null) return 0;
        
        //setup L and R nodes
        int L = magic(root.left);
        int R = magic(root.right);
        
        //calculate max by 
        //getting the sum of both nodes
        max = Math.max(max, L+R+1);
        
        //finnaly return the greater of both nodes
        return Math.max(L,R)+1;
    }
    
}