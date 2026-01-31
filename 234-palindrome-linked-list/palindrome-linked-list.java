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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;

        //step 1: find middle ele then reverse second half

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        //step 2: revesre

        ListNode prev = null;
        ListNode next;
        while(slow!=null) {
            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        ListNode rightHead = prev;
        ListNode leftHead = head;

        //now cheack , whether both list are same or not

        while(rightHead != null && leftHead != null) {
            if(rightHead.val != leftHead.val) {
                return false;
            } 
            rightHead = rightHead.next;
            leftHead = leftHead.next;

        }

        return true;
    }
}