package Class_13_LinkedList;

public class segregateEvensAndOddsGfg {
    public static void main(String[] args) {

    }
    public Node divide(Node head){
        Node d1 = new Node(0);
        Node d2 = new Node(0);
        Node t1 = d1;
        Node t2 = d2;
        Node i = head;

        while(i!=null){
            if(i.val%2==0){
                t1.next = i;
                t1 = i;
            }
            else{
                t2.next = i;
                t2 = i;
            }
            i = i.next;
        }

        t2.next = null;
        t1.next = d2.next;
        return d1.next;
    }
}
