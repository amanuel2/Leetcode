/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tmp = new ListNode(0);
        ListNode head = tmp;
        
        int carry = 0;
        while(l1 !=null || l2 != null){
            int left = (l1!=null)?l1.val:0;
            int right= (l2!=null)?l2.val:0;
            
            int sum = left+right+carry;
            carry = sum/10;
            int digit = sum%10;
            
            tmp.next = new ListNode(digit);
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
            tmp=tmp.next;
        }
        
        if(carry!=0){
            if(tmp == null)
                tmp = new ListNode(0);
            tmp.next = new ListNode(carry);
        } 
        
        return head.next;
    }
}