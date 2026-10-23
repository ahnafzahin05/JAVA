package Class_13_LinkedList;

public class mergeTwoSortedList {
    public static void main(String[] args) {

    }
    public static Node merge(Node head1, Node head2){
        Node dummy = new Node(); //dummy node
        Node i = head1;
        Node j = head2;
        Node k = dummy;

        while(i!=null && j!=null){
            if(i.val<=j.val){
                k.next = i;
                //k = i;
                i = i.next;
            }
            else{
                k.next = j;
                //k = i;
                j = j.next;
            }
            k = k.next;
        }

        if(i==null) k.next = j;
        else k.next = i;

        return dummy.next;
    }
}
