class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode temp2 = head;
        int size = 0;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        if (size == 1)
            return null;

        ListNode prev = null;
        for (int i = 0; i < size - (n); i++) {
            prev = head;
            head = head.next;
        }
        // Head to be deleted

        if (prev == null) {
            head = head.next; // remove head
            return head;
        } else
            prev.next = head.next;

        return temp2;
    }
}