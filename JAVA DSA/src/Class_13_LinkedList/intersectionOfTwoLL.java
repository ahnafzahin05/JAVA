package Class_13_LinkedList;

public class intersectionOfTwoLL {
    public static void main(String[] args) {

    }
    public Node getIntersectionNode(Node headA, Node headB) {
        int sizeA = 0, sizeB = 0, diff = 0;

        Node t1 = headA;
        while(t1!=null){
            t1 = t1.next;
            sizeA++;
        }
        Node t2 = headB;
        while(t2!=null){
            t2 = t2.next;
            sizeB++;
        }

        diff = Math.abs(sizeA-sizeB);

        t1 = headA;
        t2 = headB;
        if(sizeA>sizeB) for(int i=1; i<=diff; i++) t1 = t1.next;
        else if(sizeB>sizeA) for(int i=1; i<=diff; i++) t2 = t2.next;

        while (t1!=t2){
            t1 = t1.next;
            t2 = t2.next;
        }

        return t1;
    }
}
