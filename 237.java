class Solution {
    // [4,5,1,9]

    public void deleteNode(ListNode node) {
        if (node.next == null)
            return;

        while (true) {
            if (node.next.next == null) {
                node.val = node.next.val;
                node.next = null;
                break;
            }
            node.val = node.next.val; // [4,1,9,9]
            node = node.next;

        }

    }
}