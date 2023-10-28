// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Find the middle node
        ListNode midNode = findMid(head);

        // Step 2: Reverse the second half
        ListNode reversedSecondHalf = reverseLinkedList(midNode);

        // Step 3: Compare the first half with the reversed second half
        ListNode firstHalf = head;
        while (reversedSecondHalf != null) {
            if (firstHalf.val != reversedSecondHalf.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            reversedSecondHalf = reversedSecondHalf.next;
        }

        return true;
    }

    public ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // slow is the mid node
    }

    public ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
