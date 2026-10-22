package Class_13_LinkedList;

public class firstNodeOfLoopInLL {
    public static void main(String[] args) {

    }
    public Node cycleStart(Node head){
        Node slow = head;
        Node fast = head;
        Node b = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast==slow) break;
        }

        if(fast==null || fast.next==null) return null;

        while(b!=slow){
            b = b.next;
            slow = slow.next;
        }
        return b;

//        while(fast!=null && fast.next!=null){
//            fast = fast.next.next;
//            slow = slow.next;
//
//            if(fast==slow){
//                while(b!=slow){
//                    b = b.next;
//                    slow = slow.next;
//                }
//                return b;
//            }
//        }
//        return null;
    }
}
