package Class_13_LinkedList.Revision;

public class reverseLL {
    public static void main(String[] args) {

    }
    public Node reverseList(Node head){
        Node prev = null, f = null, curr = head;

        while(curr!=null){
            f = curr.next;
            curr.next = prev;
            prev = curr;
            curr = f;
        }

        return prev;
    }
}
