class Solution {
    public ListNode reverseList(ListNode head) {
        return reverse(head);
    }

    public ListNode reverse(ListNode node) {
        if (node == null || node.next == null)
            return node;

        ListNode head = reverse(node.next); // head = 5 && node == 4
        node.next.next = node; // 4.next.next AKA 5.next = 4
        node.next = null; // 4.next = null . So 4->NULL && 4<-5
        return head;
    }
}