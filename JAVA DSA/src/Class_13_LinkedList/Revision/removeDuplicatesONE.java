package Class_13_LinkedList.Revision;

public class removeDuplicatesONE {
    public static void main(String[] args) {

    }
    public Node removeDuplicates(Node head){
        if(head==null) return null;
        Node dummy = new Node(head.val-1);
        Node temp = dummy;
        Node a = head;

        while(a!=null){
            if(temp.val!=a.val){
                temp.next = a;
                temp = temp.next;
            }
            a = a.next;
        }

        temp.next = null;
        return dummy.next;
    }
}
