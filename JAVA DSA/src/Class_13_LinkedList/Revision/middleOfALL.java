package Class_13_LinkedList.Revision;

public class middleOfALL {
    public static void main(String[] args) {

    }
    public Node middleNode(Node head){
        Node slow = head, fast = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}
