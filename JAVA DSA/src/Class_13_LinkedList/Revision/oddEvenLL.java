package Class_13_LinkedList.Revision;

public class oddEvenLL {
    public static void main(String[] args) {

    }
    public Node oddEvenNode(Node head){
        Node dummy1 = new Node(0), dummy2 = new Node(0);
        Node t1 = dummy1, t2 = dummy2;
        Node a = head;

        while(a!=null){
            t1.next = a;
            t1 = t1.next;

            a = a.next;

            t2.next = a;
            t2 = t2.next;

            if(a!=null) a = a.next;
        }

        t1.next = dummy2.next;

        return dummy1.next;
    }
}
