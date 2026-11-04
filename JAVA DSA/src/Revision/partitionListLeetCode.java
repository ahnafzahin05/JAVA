package Revision;

public class partitionListLeetCode {
    public static void main(String[] args) {

    }
    public Node partition(Node head, int x){
        Node h1 = new Node(0), t1 = h1;
        Node h2 = new Node(0), t2 = h2;
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

        t1.next = h2.next;
        t2.next = null;
        return h1.next;
    }
}
