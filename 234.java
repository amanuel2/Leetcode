class Solution {
    ListNode node;

    public boolean isPalindrome(ListNode head) {
        node = head;
        return palindrome(head);
    }

    public boolean palindrome(ListNode head) {
        if (head == null)
            return true;

        boolean pal = palindrome(head.next);

        if (pal == false)
            return false; // if at one point false , then keep returning false

        if (node.val == head.val) { // If the very end call stack is same as first
            node = node.next; // then current itteration is a palindrome
            return true;
        }
        return false;
    }

}