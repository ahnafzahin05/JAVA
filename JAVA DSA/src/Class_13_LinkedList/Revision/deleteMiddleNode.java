package Class_13_LinkedList.Revision;

public class deleteMiddleNode {
    public static void main(String[] args) {

    }
    public Node delete(Node head){
        if(head==null || head.next==null) return null;

        Node slow = head, fast = head;
        Node temp = slow;

        while(fast!=null && fast.next!=null){
            temp = slow;
            fast = fast.next.next;
            slow = slow.next;
        }

        temp.next = slow.next;
        return head;
    }
}
