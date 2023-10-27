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
           if(headA == null || headB == null){
               return null;
           }

           int lenA = getLength(headA);
           int lenB = getLength(headB);

           while(lenA>lenB){
                 lenA--;
                 headA = headA.next;
           }

           while(lenB>lenA){
                  lenB--;
                  headB = headB.next;
           }

           while(headA!=headB){
               headA = headA.next;
               headB = headB.next;
           }

           return headA;

           
    }
    public static int getLength(ListNode head){
        int count = 0;
        ListNode temp = head;

        while(temp!=null){
             count += 1;
             temp = temp.next; 
        }

        return count;
    }
}