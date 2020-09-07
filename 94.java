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
    List<Integer> nums = new ArrayList();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList();
        //Traverse left
        inorderTraversal(root.left);
        //Get the value(root)
        nums.add(root.val);
        //Traverse right
        inorderTraversal(root.right);
        
        //finnaly return nums
        //only matters at the end when u return
        //the full list
        return nums;
    }
}