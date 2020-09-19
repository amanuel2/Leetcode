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

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null) return new ArrayList();
        List<List<Integer>> list = new Stack();
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        list.add(Arrays.asList(root.val));
        
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> currLevel = new ArrayList();
            
            for(int i=0; i<size; i++){
                TreeNode curr = queue.remove();
                if(curr.left != null){
                    queue.add(curr.left);
                    currLevel.add(curr.left.val);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                    currLevel.add(curr.right.val);
                }
            }
            
            if(!currLevel.isEmpty())
                list.add(currLevel);
        }
        
        
        
        return reverseDoubleArr(list);
        
    }
    
    public List<List<Integer>> reverseDoubleArr(List<List<Integer>> l){
        List<List<Integer>> list = new ArrayList();
        for(int i=l.size()-1; i>=0; i--){
            list.add(l.get(i));
        }
        
        return list;
    }
}
