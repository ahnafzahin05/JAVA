package Revision;

public class removeDuplicatesFromSortedLL {
    public static void main(String[] args) {

    }
    public Node deleteDuplicates(Node head){
        if(head==null || head.next==null) return head;

        Node dummy = new Node(-1);
        dummy.next = head;
        Node temp = dummy;
        Node i = head;

        while(i.next!=null){
            if(i.next.val!=i.val){
                temp.next = i;
                temp = i;
            }
            i = i.next;
        }
        temp.next = i;

        return dummy.next;
    }
}
