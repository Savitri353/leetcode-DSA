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
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) {
            return head;
        }

        //create two linkedlists

        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-2);

        ListNode lessThenX = dummy1; 
        ListNode greaterThenX = dummy2;

        ListNode temp = head;

        while(temp != null) {
            if(temp.val < x) {
                lessThenX.next = temp;
                lessThenX = lessThenX.next;
                temp = temp.next;
            } else {
                greaterThenX.next = temp;
                greaterThenX = greaterThenX.next;
                temp = temp.next;
            }
        }

        //terminate greater list
        greaterThenX.next = null;

        lessThenX.next = dummy2.next;
        return dummy1.next;
    }
}    