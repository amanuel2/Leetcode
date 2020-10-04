/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet();
        
        //Get to the end of headA
        while(headA != null){
            set.add(headA);
            headA = headA.next;
        }
        
        //Now go through headB and check if there
        //are similarties with headA
        while(headB != null){
            if(set.contains(headB))
                return headB;
            
            headB = headB.next;
        }
        
        return null;
    }
}