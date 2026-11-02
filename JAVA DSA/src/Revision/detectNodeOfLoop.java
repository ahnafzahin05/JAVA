package Revision;

public class detectNodeOfLoop {
    public static void main(String[] args) {

    }
    public Node detectCycle(Node head){
        Node fast = head;
        Node slow = head;
        Node b = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast){
                while(b!=slow){
                    b = b.next;
                    slow = slow.next;
                }
                return b;
            }
        }
        return null;
    }
}
