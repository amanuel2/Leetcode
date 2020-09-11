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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null) return new ArrayList();
        
        //Final List to return
        List<List<Integer>> ret = new ArrayList<>();
        
        //This is the current level
        //and the next level (AKA Next level in BFS)
        Stack<TreeNode> currLvl = new Stack<>();
        Stack<TreeNode> nextLvl = new Stack<>();
        
        //Push root and start with leftToRight true
        currLvl.push(root);
        boolean leftToRight = true;
        
        //Until current level is empty AKA end of list
        List<Integer> list = new ArrayList<>();
        while(!currLvl.isEmpty()){
            //First pop the current value of currLvl
            TreeNode curr = currLvl.pop();
            list.add(curr.val);
            
            //If not an empty current List 
            if(curr != null){
                //Push accordingly
                if(leftToRight){
                    if(curr.left!=null)  nextLvl.push(curr.left);
                    if(curr.right!=null) nextLvl.push(curr.right);
                } else{
                    if(curr.right!=null) nextLvl.push(curr.right);
                    if(curr.left!=null)  nextLvl.push(curr.left);
                }
                
            }
            
            //IMPORTANT Technique here
            if(currLvl.isEmpty()){
                //Switch left to right each time going to the next level
                leftToRight = !leftToRight;
                currLvl = (Stack<TreeNode>) nextLvl.clone();
                nextLvl.clear();
                
                //And add the current level(array) to the double arraylist
                ret.add(new ArrayList<Integer>(list));
                list.clear();
            }
            
        }
        
        return ret;
    }
}