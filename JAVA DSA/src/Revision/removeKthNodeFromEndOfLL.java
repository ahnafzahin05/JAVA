package Revision;

public class removeKthNodeFromEndOfLL {
    public static void main(String[] args) {

    }
    public static Node remove(Node head, int k){
        Node fast = head;
        Node slow = head;
        Node prev = slow;

        for(int i=1; i<=k; i++) fast = fast.next;

        while(fast!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }

        return null;
    }
}
