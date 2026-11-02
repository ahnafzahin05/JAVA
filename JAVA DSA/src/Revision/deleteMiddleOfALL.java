package Revision;

public class deleteMiddleOfALL {
    public static void main(String[] args) {

    }
    public static Node deleteMIddleNode(Node head){
        Node fast = head;
        Node slow = head;
        Node prev = slow;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        if(head.next==null) return null;

        prev.next = slow.next;
        return head;
    }
}
