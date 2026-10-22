package Class_13_LinkedList;

public class removeNthNodeFromEndofLL {
    public static void main(String[] args) {

    }
    public Node removeNthFromEnd(Node head, int n){
        if(head==null || head.next==null) return null;

        Node fast = head;
        Node slow = head;
        Node prev = null;

        for(int i=1; i<=n; i++){
            fast = fast.next;
        }

        while(fast!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }

        if(slow==head){
            head = head.next;
            return head;
        }

        prev.next = slow.next;
        return head;
    }
}
