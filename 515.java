class Solution {
    List<Integer> max_vals = new ArrayList();
    public List<Integer> largestValues(TreeNode root) {
        if(root == null) return new LinkedList();
        
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            int max_num = Integer.MIN_VALUE;
            for(int i=0; i<size; i++){
                TreeNode curr = queue.poll();
                max_num = Math.max(curr.val, max_num);
                if(curr.left != null) queue.offer(curr.left);
                if(curr.right != null)queue.offer(curr.right);
            }
            
            max_vals.add(max_num);
        }
        return max_vals;
    }
}