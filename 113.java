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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = new ArrayList();
        
        //magic function that solves all issues :)
        magic(root, sum, new ArrayList(), list);
        
        return list;
    }
    
    public void magic(TreeNode root, int sum, List<Integer> curr, List<List<Integer>> list){
        //if no more to traverse return out
        if(root == null) return;
        
        //add each element it goes through
        curr.add(root.val);
        
        //if the current node is equal to sum(which we decrease in the recursive calls below)
        //and its a leaf node?? JACKPOT
        if(root.val == sum && root.left == null && root.right == null){
            list.add(curr);
            return;
        }
        
        //Here we recursively call left and right
        //subtract the sum as we go
        //AND we make sure to make new copies of current to not
        //use the same instance each recrusive call
        magic(root.left, sum-root.val, new ArrayList(curr), list);
        magic(root.right, sum-root.val, new ArrayList(curr), list);
        
    }
}