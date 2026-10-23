package Class_13_LinkedList;

public class swapNodesInPairs {
    public static void main(String[] args) {
    }
    public static Node swapPairs(Node head){
        Node dummy = new Node(0);
        dummy.next = head;
        Node t = dummy;
        Node first = null;
        Node second = null;

        while(t.next!=null && t.next.next!=null){
            first = t.next;
            second = t.next.next;

            t.next = second;
            first.next = second.next;
            second.next = first;
            t = first;
        }

        return dummy.next;
    }
}
