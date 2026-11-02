package Revision;

public class rotateListCW {
    public static void main(String[] args) {

    }
    public Node rotate(Node head, int k){
        if(head==null || head.next==null) return head;

        Node temp = head;
        int size = 0;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        k%=size;
        if(k==0) return head;

        Node i = head;
        Node j = head;
        for(int m=1; m<=k; m++) j = j.next;
        while(j.next!=null){
            j = j.next;
            i = i.next;
        }

        Node h2 = i.next;
        i.next = null;
        j.next = head;
        return h2;
    }
}
