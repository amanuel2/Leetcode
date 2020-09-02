/*
 Uses Merge Sort
*/
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode tail = head;
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null){
            tail = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        tail.next = null;
        
        ListNode left  = sortList(head);
        ListNode right = sortList(slow);
        
        return merge(left,right);
    }
    
    
    public ListNode merge(ListNode left, ListNode right){
        ListNode sorted = new ListNode(0);
        ListNode sortedHead = sorted;
        
        
        while(left!=null && right!=null){
            if(left.val<right.val){
                sorted.next = left;
                left = left.next;
            } else{
                sorted.next = right;
                right = right.next;
            }
            sorted = sorted.next;
        }
        
        //Handle edge cases
        if(left!=null){
            sorted.next = left;
            sorted = sorted.next;
        }
        
        if(right!=null){
            sorted.next = right;
        }
        
        return sortedHead.next;
    }
    
}