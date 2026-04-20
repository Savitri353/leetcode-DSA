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
    //    //if there is only one node
    //    if(head.next == null) {
    //         return null;
    //    }

    //     //calculate size
    //     ListNode temp = head;
    //     int size=0;
    //     while(temp != null) {
    //         temp = temp.next;
    //         size++;
    //     }

    //     if(n == size) {
    //         return head.next;
    //     }
    //     //now remove the nth element from the last
    //     ListNode prev = head;
    //     int prevIndex = size-n;
    //     int i=1;
    //     while(i < prevIndex) {
    //         prev = prev.next;
    //         i++;
    //     }

    //     prev.next = prev.next.next;

    //     return head;

    // *********************
    //two pointers

    if(head.next == null) return null;
    ListNode dummy = new ListNode(0);
    dummy.next = head;


    ListNode fast = dummy;
    ListNode slow = dummy;

    
    //move fast n+1 steps ahead
    for(int i=1; i<=n+1; i++) {
        fast = fast.next;
       
    }

    while(fast != null) {
        slow = slow.next;
        fast = fast.next;
    }

    slow.next = slow.next.next;
    return dummy.next;
    }
}