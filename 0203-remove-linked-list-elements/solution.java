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
    public ListNode removeElements(ListNode head, int val) {
        // Step 1: Create dummy node
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode curr = dummy;

        // Step 2: Traverse list
        while (curr.next != null) {
            if (curr.next.val == val) {
                // remove node
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}
