package Class_13_LinkedList;

public class kthFromEndOfLL {
    public static void main(String[] args) {

    }

    public int getKthFromLast(Node head, int k) {
        Node fast = head;
        Node slow = head;

        for(int i=1; i<=k; i++) {
            if(fast==null) return -1;
            fast = fast.next;
        }

        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }

        return slow.val;

    }
}
