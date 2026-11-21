package Class_13_LinkedList.Revision;

public class mergeTwoSortedLists {
    public static void main(String[] args) {

    }
    public Node merge(Node list1, Node list2){
        Node dummy = new Node(0);
        Node temp = dummy;
        Node a = list1, b = list2;

        while(a!=null && b!=null){
            if(a.val<b.val){
                temp.next = a;
                a = a.next;
            }
            else{
                temp.next = b;
                b = b.next;
            }
            temp = temp.next;
        }

        if(a==null) temp.next = b;
        else temp.next = a;

        return dummy.next;
    }
}
