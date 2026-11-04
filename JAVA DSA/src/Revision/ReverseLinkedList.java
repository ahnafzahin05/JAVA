package Revision;

public class ReverseLinkedList {
    public static void main(String[] args) {

    }
    public Node reverseList(Node head){
        Node f = null, prev = null;
        Node curr = head;

        while(curr!=null){
            f = curr.next;
            curr.next = prev;
            prev = curr;
            curr = f;
        }

        return prev;
    }
}
