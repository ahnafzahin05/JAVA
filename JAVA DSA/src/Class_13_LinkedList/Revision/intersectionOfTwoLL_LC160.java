package Class_13_LinkedList.Revision;

public class intersectionOfTwoLL_LC160 {
    public static void main(String[] args) {

    }
    public Node getIntersectionNode(Node headA, Node headB){
        Node tempA = headA, tempB = headB;
        int sizeA = size(headA), sizeB = size(headB);

        if(sizeB>sizeA) for(int i=0; i<sizeB-sizeA; i++) tempB = tempB.next;
        else if(sizeA>sizeB) for(int i=0; i<sizeA-sizeB; i++) tempA = tempA.next;

        while(tempA!=tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return null;
    }
    public int size(Node head){
        int size = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        return size;
    }
    public Node findIntersectionGfG(Node head1, Node head2){
        Node t1 = head1, t2 = head2;
        Node dummy = new Node(0);
        Node temp = dummy;

        while(t1!=null){
            t2 = head2;
            while(t2!=null){
                if(t1.val==t2.val){
                    temp.next = t1;
                    temp = temp.next;
                    break;
                }
                t2 = t2.next;
            }
            t1 = t1.next;
        }
        temp.next = null;
        return dummy.next;
    }
}
