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
    public ListNode rotateRight(ListNode head, int k) {
       if(head == null || head.next == null || k==0) {
        return head;
       }

       //calculate the length of linkedlist
       ListNode curr = head;
       int length = 1;

       while(curr.next != null) {
            length++;
            curr = curr.next;
       }

       k = k%length;

       if(k == 0) {
        return head;
       }
        // circular
       curr.next = head;
       curr = curr.next;
        ListNode newHead;

        for(int i=1; i<length-k; i++) {
            curr = curr.next;
           
        }

        newHead = curr.next;
        curr.next = null;

        return newHead;
    }
}