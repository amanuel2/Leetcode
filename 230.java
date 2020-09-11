
//Two Methods
//main tech just do a inorder traversal


//Theta(n)
class Solution {
    
    List<Integer> list = new ArrayList();
    public int kthSmallest(TreeNode root, int k) {
        
        list.add(root.val);
        recursive(root, k);
        
        return list.get(k);
    }
    
    public void recursive(TreeNode root, int k){
        if(root == null) return;

        recursive(root.left, k);
        list.add(root.val);
        recursive(root.right,k);
    }
}


//Theta(logn) ish
class Solution {
    
    int index = 1;
    int value = 0;
    public int kthSmallest(TreeNode root, int k) {
        
        value = root.val;
        recursive(root, k);
        
        return value;
    }
    
    public void recursive(TreeNode root, int k){
        if(root == null) return;
        
        recursive(root.left, k);
        if(index++ == k) value = root.val;
        recursive(root.right,k);
    }
}