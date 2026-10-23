package Class_13_LinkedList;

public class partitionList {
    public static void main(String[] args) {

    }
    public Node partition(Node head, int x){
        Node dummy1 = new Node(-1);
        Node dummy2 = new Node(-1);
        Node t1 = dummy1;
        Node t2 = dummy2;
        Node i = head;

        while(i!=null){
            if(i.val<x){
                t1.next = i;
                t1 = t1.next;
            }
            else{
                t2.next = i;
                t2 = t2.next;
            }
            i = i.next;
        }

        t2.next = null;
        t1.next = dummy2.next;
        return dummy1.next;
    }
}
