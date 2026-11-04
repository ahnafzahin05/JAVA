package Class_13_LinkedList;

public class swapNodesInPairs {
    public static void main(String[] args) {
    }
    public static Node swapPairs(Node head){
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

        while(prev.next!=null && prev.next.next!=null){
            Node a = prev.next;
            Node b = a.next;

            a.next = b.next;
            b.next = a;
            prev.next = b;

            prev = a;
        }

        return dummy.next;

        //APPROACH - 2 (Separate Even and Odd indices in two new lists, and then add odd-even alternatively in a new list
//        Node d1 = new Node(0), t1 = d1; //holds even indices nodes
//        Node d2 = new Node(0), t2 = d2; //holds odd indices nodes
//        Node i = head;
//
//        while(i!=null){
//            t2.next = i;
//            i = i.next;
//            t2 = t2.next;
//
//            t1.next = i;
//            if(i!=null) i = i.next;
//            t1 = t1.next;
//        }
//
//        t2.next = null;
//
//        t1 = d1.next; t2 = d2.next;
//        Node newHead = new Node(0), temp = newHead;
//        //new odd index = old even index (d1)
//        //new even index = old odd index (d2)
//        while(t1!=null || t2!=null){ //while(t2!=null) is okay
//            if(t1!=null){
//                temp.next = t1;
//                temp = temp.next;
//                t1 = t1.next;
//            }
//            if(t2!=null){
//                temp.next = t2;
//                temp = temp.next;
//                t2 = t2.next;
//            }
//        }
//        temp.next = null;
//        return newHead.next;
    }
}
