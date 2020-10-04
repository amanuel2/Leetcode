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
    public List<String> binaryTreePaths(TreeNode root) {
        //Output
        List<String> out = new ArrayList();
        
        //magic function that solves all out problems :)
        magic(out, root, "");
        
        return out;
    }
    
    public void magic(List<String> out, TreeNode root, String curr){
        //If this is a LEAF node
        if(root != null && root.left == null && root.right == null){
            //Then add the value of now and add to the output
            curr+=root.val;
            out.add(curr);
            return;
        }
        //If this is just a null root then go back in stack
        if(root == null) return;
        
        // PRE-ORDER Traveral! (VISIT -> LEFT -> RIGHT)
        //First add the current value
        curr+=(root.val +"->");
        //Then go through left and right nodes
        magic(out,root.left,curr);
        magic(out,root.right,curr);
    }
}