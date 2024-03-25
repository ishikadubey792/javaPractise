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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }

        int size = 0;
        ListNode current = head;
        
        // Count the number of nodes in the linked list
        while (current != null) {
            size++;
            current = current.next;
        }
        int position = size - n;
        if(position == 0){
            return head.next;
        }
        // Find the node before the one to be remove
         current = head;
        ListNode prev = current;

        while(position != 0){
            prev = current; 
            current = current.next;
            position--;
        }
        
        prev.next = current.next;

        return head;
    }
}