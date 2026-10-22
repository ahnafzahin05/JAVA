package Class_13_LinkedList;

public class detectLoopInLL {
    public static void main(String[] args) {

    }
    public static boolean detectLoop(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next; //infact, we can use different speed of fast
            //fast = fast.next.next.next //then, we've to include one more cond: && fast.next.next!=null
            if(fast==slow) return true;
        }
        return false;
    }
}
