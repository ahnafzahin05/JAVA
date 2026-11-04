package Revision;

public class swapNodesInPairs {
    public static void main(String[] args) {

    }
    public Node swapPairs(Node head){
        Node d1 = new Node(0), t1 = d1; //holds even indices nodes
        Node d2 = new Node(0), t2 = d2; //holds odd indices nodes
        Node i = head;
        //int idx = 1;

        while(i!=null){
            t2.next = i;
            i = i.next;
            t2 = t2.next;

            t1.next = i;
            if(i!=null) i = i.next;
            t1 = t1.next;

//            if(idx%2==0){
//                t1.next = i;
//                t1 = t1.next;
//            }
//            else{
//                t2.next = i;
//                t2 = t2.next;
//            }
//            i = i.next;
//            idx++;
        }

        t2.next = null;

        t1 = d1.next; t2 = d2.next;
        Node newHead = new Node(0), temp = newHead;
        //new odd index = old even index (d1)
        //new even index = old odd index (d2)
        while(t1!=null || t2!=null){
            if(t1!=null){
                temp.next = t1;
                temp = temp.next;
                t1 = t1.next;
            }
            if(t2!=null){
                temp.next = t2;
                temp = temp.next;
                t2 = t2.next;
            }
        }
        temp.next = null;
        return newHead.next;
    }
}
