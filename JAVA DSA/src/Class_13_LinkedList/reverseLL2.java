package Class_13_LinkedList;

public class reverseLL2 {
    public static void main(String[] args) {
// NOT DONE YET
    }
    public Node reverseBetween(Node head, int left, int right){
        Node dummy = new Node(0), t = dummy;
        dummy.next = head;

        Node h1 = dummy, t1 = dummy;
        Node h2 = dummy, t2 = dummy;
        Node h3 = dummy;

        for(int i=0; i<left; i++) t = t.next;
        t1 = t.next;
        t = t.next;
        h2 = t;
        t1.next = null;

        for(int i=1; i<=right-left; i++) t = t.next;
        t2 = t;
        h3 = t.next;
        t2.next = null;

        reverse(h2);

        t1.next = t2;
        h2.next = h3;

        return dummy.next;

    }
    public void reverse(Node head){
        Node prev = null, fwd = null;
        Node curr = head;

        while(curr!=null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }

        //return prev;
    }
}
