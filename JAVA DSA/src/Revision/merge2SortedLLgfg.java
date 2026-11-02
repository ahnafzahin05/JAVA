package Revision;

public class merge2SortedLLgfg {
    public static void main(String[] args) {

    }
    public Node sortedMerge(Node head1, Node head2){
        Node dummy = new Node(-1);
        Node temp = dummy;
        Node i = head1, j = head2;

        while(i!=null && j!=null){
            if(i.val<j.val) {
                temp.next = i;
                i = i.next;
            }
            else {
                temp.next = j;
                j = j.next;
            }
            temp = temp.next;
        }

        if(i==null) temp.next = j;
        else temp.next = i;

        return dummy.next;
    }
}
