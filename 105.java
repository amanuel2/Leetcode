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
    
    Map<Integer, Integer> map = new HashMap<>();
    int index;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //Set up hashmap at beggining
        //get all inorder elements indexes
        for(int i=0; i<inorder.length; i++) map.put(inorder[i], i);
        
        return build(preorder, inorder, 0 , preorder.length-1);
    }
    
    public TreeNode build(int[] preorder, int[] inorder, int start, int end){
        if(start>end) return null;
        
        //get the current node
        TreeNode curr = new TreeNode(preorder[index++]);
        
        if(curr == null) return null;
        if(start==end) return curr;
        
        //Index of root in the InOrder is basically
        //this
        int idx = map.get(curr.val);
        
        //Go from start to index-1 which is left side of tree
        //Go from index+1 to end which is right side of tree
        curr.left  = build(preorder,inorder,start,idx-1); 
        curr.right = build(preorder,inorder,idx+1,end);
        
        return curr;
        
    }
    
}