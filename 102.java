class Solution {
    List<List<Integer>> list = new ArrayList();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null)
            return list;

        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            List<Integer> inner = new ArrayList();

            // Loop through level
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                inner.add(curr.val);
                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }

            if (!inner.isEmpty())
                list.add(inner);
        }

        return list;

    }
}