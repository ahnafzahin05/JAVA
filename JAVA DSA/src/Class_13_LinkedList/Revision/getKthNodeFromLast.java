package Class_13_LinkedList.Revision;

public class getKthNodeFromLast {
    public static void main(String[] args) {

    }
    public int kthNode(Node head, int k){
        Node fast = head, slow = head;

        for(int i=0; i<k; i++){
            if(fast==null) return -1;
            fast = fast.next;
        }
        if(head.next==null) return head.val;

        while(fast!=null && fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }

        return slow.next.val;
    }
}
