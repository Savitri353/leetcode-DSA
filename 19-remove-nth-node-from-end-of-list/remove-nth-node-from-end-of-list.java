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
        
        

        ListNode temp = head;
        int size = 0;
        while(temp != null) {
            size++;
            temp = temp.next;
        }

        if(size == n) {
            return head.next;
        }
        int i=1;
        int prev = size-n;

        temp = head;
        while(i<prev) {
            temp = temp.next;
            i++;
        }

        temp.next = temp.next.next;

        return head;
    }
}