package Class_13_LinkedList.Revision;

public class segregateEvensAndOdds {
    public static void main(String[] args) {

    }
    public Node divide(Node head){
        Node dummy1 = new Node(0), dummy2 = new Node(0);
        Node t1 = dummy1, t2 = dummy2;
        Node a = head;

        while(a!=null){
            if(a.val%2==0){
                t1.next = a;
                t1 = t1.next;
            }
            else{
                t2.next = a;
                t2 = t2.next;
            }
            a = a.next;
        }

        t1.next = dummy2.next;
        t2.next = null;

        return dummy1.next;














        //This is one solution but it got TLE
//        Node dummy = new Node(0);
//        Node temp = dummy;
//        Node a = head;
//
//        while(a!=null){
//            if(a.val%2==0){
//                temp.next = a;
//                temp = temp.next;
//            }
//            a = a.next;
//        }
//
//        a = head;
//
//        while(a!=null){
//            if(a.val%2!=0){
//                temp.next = a;
//                temp = temp.next;
//            }
//            a = a.next;
//        }
//
//        temp.next = null;
//
//        return dummy.next;
    }
}
