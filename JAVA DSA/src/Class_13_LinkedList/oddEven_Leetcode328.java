package Class_13_LinkedList;

public class oddEven_Leetcode328 {
    public static void main(String[] args) {

    }
    public Node oddEvenList(Node head){
        if(head==null || head.next==null) return head;

        Node d1 = new Node(0);
        Node d2 = new Node(0);
        Node t1 = d1;
        Node t2 = d2;
        Node i = head;
        int idx = 1;

        while(i!=null){
            if(idx%2!=0){
                t1.next = i;
                t1 = i;
            }
            else{
                t2.next = i;
                t2 = i;
            }
            i = i.next;
            idx++;
        }

        t2.next = null;
        t1.next = d2.next;
        return d1.next;

    }
}
