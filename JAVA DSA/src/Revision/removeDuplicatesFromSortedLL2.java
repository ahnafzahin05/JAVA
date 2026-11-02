package Revision;

public class removeDuplicatesFromSortedLL2 {
    public static void main(String[] args) {

    }
    public Node deleteDuplicates(Node head){
        Node dummy = new Node(-1);
        dummy.next = head;
        Node temp = dummy;

        Node i = head;
        Node j = head;

        while(j!=null){
            if(j.val==i.val) j = j.next;
            else{
                if(i.next==j){
                    temp.next = i;
                    temp = i;
                }
                i = j;
            }
        }
        if(i!=null && i.next==null) temp.next = i;
        else temp.next = null;

        return dummy.next;
    }
}
