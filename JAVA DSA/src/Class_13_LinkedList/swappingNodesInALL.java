package Class_13_LinkedList;

public class swappingNodesInALL {
    public static void main(String[] args) {

    }
    public Node swapNodes(Node head, int k) {
        Node l = head;
        Node r = head;
        Node lPrev = head;
        Node lPost = head;
        Node rPrev = head;
        Node rPost = head;

        Node fast = head;
        Node slow = head;

        for(int i=1; i<=k; i++){
            fast = fast.next;
        }

        while(fast!=null){
            rPrev = slow;
            slow = slow.next;
            fast = fast.next;
        }

        r = slow;
        rPost = slow.next;

        for(int i=1; i<k; i++){
            lPrev = l;
            l = l.next;
        }

        lPost = l.next;

        lPrev.next = r;
        r.next = lPost;
        rPrev.next = l;
        l.next = rPost;

        return head;

    }
}
