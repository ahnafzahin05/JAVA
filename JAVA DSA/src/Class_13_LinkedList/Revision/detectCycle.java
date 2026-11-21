package Class_13_LinkedList.Revision;

public class detectCycle {
    public static void main(String[] args) {

    }
    public boolean hasCycle(Node head){
        Node slow = head, fast = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow) return true;
        }

        return false;
    }
    public Node cycleStart(Node head){
        Node slow = head, fast = head, temp = head;
        boolean hasCycle = false;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast){
                while(slow!=temp){
                    slow = slow.next;
                    temp = temp.next;
                }
                return slow;
            }
        }

        return null;
    }
}
