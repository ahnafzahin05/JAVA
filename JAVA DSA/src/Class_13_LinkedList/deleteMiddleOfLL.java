package Class_13_LinkedList;

public class deleteMiddleOfLL {
    public static void main(String[] args) {

    }

    public Node deleteMid(Node head){
        if(head==null || head.next==null) return null;

        Node fast = head.next.next;
        Node slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return head;

//        Node fast = head;
//        Node slow = head;
//        Node prev = null;
//
//        while(fast!=null && fast.next!=null){
//            prev = slow;
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//
//        if(head.next==null) return null;
//        prev.next = slow.next;
//        return head;

    }
}
