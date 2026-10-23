package Class_13_LinkedList;

public class partitionListGfg {
    public static void main(String[] args) {

    }
    public Node partition(Node head, int x){
        Node d1 = new Node(0); //lesser
        Node d2 = new Node(0); //equal
        Node d3 = new Node(0); //greater
        Node t1 = d1;
        Node t2 = d2;
        Node t3 = d3;
        Node i = head;

        while(i!=null){
            if(i.val<x){
                t1.next = i;
                t1 = i;
            }
            else if(i.val==x){
                t2.next = i;
                t2 = i;
            }
            else{
                t3.next = i;
                t3 = i;
            }
            i = i.next;
        }
        //the order is very important
        t3.next = null; 
        t2.next = d3.next;
        t1.next = d2.next;
        return d1.next;
    }
}
