package Class_13_LinkedList.Revision;

public class removeNthNodeFromEnd {
    public static void main(String[] args) {

    }
    public Node remove(Node head, int n){
        Node fast = head, slow = head;

        Node dummy = new Node(0);
        Node temp = dummy;

        for(int i=0; i<n; i++) fast = fast.next;

        while(fast!=null){
            temp.next = slow;
            temp = temp.next;

            fast = fast.next;
            slow = slow.next;
        }

        temp.next = slow.next;
        return dummy.next;
    }
}
