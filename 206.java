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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        //normal traverse
        while(curr!=null){
            
            //store next
            next = curr.next;
            //set next to the previous
            curr.next = prev;
            
            //setup the nodes for next loop
            prev = curr;
            curr = next;
        }
        
        //return the "end" but actually the start
        //since reverse list
        return prev;
    }
}