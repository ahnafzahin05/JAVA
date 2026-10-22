package Class_13_LinkedList;

public class rotateList {
    public static void main(String[] args) {

    }
    public Node rotateClockwise(Node head, int k){
        if(head==null || head.next==null) return head;

        int n = size(head);
        k = k%n;
        if(k==0) return head;

        Node slow = head;
        Node fast = head;

        for(int i=1; i<=k+1; i++) fast = fast.next;
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        Node newHead = slow.next;
        slow.next = null;
        Node temp = newHead;

        while(temp.next!=null){
            temp = temp.next;
        }

        temp.next = head;

        return newHead;
    }

    public int size(Node head) {
        int n = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            n++;
        }
        return n;
    }
}
