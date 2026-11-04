package Class_13_LinkedList;

public class oddEven_Leetcode328 {
    public static void main(String[] args) {

    }
    public Node oddEvenList(Node head){
        Node odd = new Node(-1), t1 = odd;
        Node even = new Node(-1), t2 = even;
        Node t = head;

        while(t!=null){
            t1.next = t;
            t = t.next;
            t1 = t1.next;

            t2.next = t;
            if(t!=null) t = t.next; //odds can be more than even, so if there is more odd, after odd calc t will go
            //to null, then there is no meaning of null = null.next
            t2 = t2.next;
        }

        t1.next = even.next;
        return odd.next;


//        if(head==null || head.next==null) return head;
//
//        Node d1 = new Node(0);
//        Node d2 = new Node(0);
//        Node t1 = d1;
//        Node t2 = d2;
//        Node i = head;
//        int idx = 1;
//
//        while(i!=null){
//            if(idx%2!=0){
//                t1.next = i;
//                t1 = i;
//            }
//            else{
//                t2.next = i;
//                t2 = i;
//            }
//            i = i.next;
//            idx++;
//        }
//
//        t2.next = null;
//        t1.next = d2.next;
//        return d1.next;

    }
}
