package Class_13_LinkedList;

public class remDuplicatesFromSortedLL2 {
    public static void main(String[] args) {

    }
    public Node deleteDuplicates(Node head){
        Node dummy = new Node(0);
        Node i = head;
        Node temp = dummy;

        while(i!=null){
            if(i.next==null || i.val!= i.next.val){
                temp.next = i;
                temp = i;
                i = i.next;
            }
            else{
                int dup = i.val;
                while(i!=null && i.val==dup) i = i.next;
//                Node j = i.next;
//                while(j!=null && j.val == i.val) j = j.next;
//                i = j;

            }
        }

        temp.next = null;

        return dummy.next;
    }
}
