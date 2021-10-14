class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null; // A pointer to remember the previous node as there is no implementation in a singly-linked list
        ListNode curr = head; // Set our current or temp pointer to the head of the LinkedList
        ListNode next = null; // Set our next pointer to null
        
        while (curr != null) { // While we have nodes in the linked list..
            next = curr.next; // "Remember" our next value 
            curr.next = prev; // Make our current node point to the previous node (reversal)
            prev = curr; // Advance our prev pointer to current
            curr = next; // Advance our curr pointer to next
        }
        return prev; // Return the head (prev) of the linked list, reversed
    }
}
