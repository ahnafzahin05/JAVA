package Revision;

public class intersectionOfLL {
    public static void main(String[] args) {

    }
    public Node getIntersectionNode(Node headA, Node headB){
        int sizeA = 0, sizeB = 0;
        Node tA = headA, tB = headB;
        while(tA!=null){
            tA = tA.next;
            sizeA++;
        }
        while(tB!=null){
            tB = tB.next;
            sizeB++;
        }
        tA = headA; tB = headB;
        int diff = Math.abs(sizeA-sizeB);

        if(sizeA>sizeB) for(int i=1; i<=diff; i++) tA = tA.next;
        else if(sizeA<sizeB) for(int i=1; i<=diff; i++) tB = tB.next;

        while(tA!=tB){
            tA = tA.next;
            tB = tB.next;
        }

        return tA;
    }
}
