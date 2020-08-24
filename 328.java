class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        
        ListNode odd =  head;
        ListNode even = head.next;
        
        ListNode evenHead = even;
        ListNode oddHead  = odd; 

        while(even!=null && even.next!=null){
            odd.next = even.next;
            even.next = even.next.next;
            
            even = even.next;
            odd = odd.next;
        }
        
        odd.next = evenHead;
        return head;
    }
}