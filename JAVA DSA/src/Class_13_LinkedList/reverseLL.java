package Class_13_LinkedList;

public class reverseLL {
    public static void main(String[] args) {

    }
    public static Node reverse(Node head){
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
