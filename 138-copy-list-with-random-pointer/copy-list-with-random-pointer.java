public class Solution {
    public Node copyRandomList(Node head) {
       if(head == null) return null;

       //step1: map old nodes to new nodes
       HashMap<Node, Node> map = new HashMap<>();

       Node curr = head;
       while(curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
       }

       //step 2: assign next and random pointers
       curr = head;
       while(curr != null) {
            Node copy = map.get(curr);

            copy.next = map.get(curr.next);
            copy.random = map.get(curr.random);

            curr = curr.next;
       }

       return map.get(head);
    }
}