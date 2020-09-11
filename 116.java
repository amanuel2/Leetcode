/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

//Level Order Traversal
class Solution {
    public Node connect(Node root) {
        //If null 
        if(root == null) return null;
        
        //Setup Queue
        Queue<Node> queue = new LinkedList();
        queue.add(root);
        queue.add(null);
        
        //While its empty loop
        while(!queue.isEmpty()){
            //Get current node to work with
            Node curr = queue.poll();
            if(queue.isEmpty()){
                //Finished Entire Tree
                return root;
            } else if(curr == null){
                //Finished Single Level
                queue.add(null);
            } else{
                //Peek the very right value
                curr.next = queue.peek();
                
                //Add to the left and right if not null
                if(curr.left != null) queue.add(curr.left);
                if(curr.right!= null) queue.add(curr.right);
            }
        }
        
        return null;
    }
}