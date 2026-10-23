package Class_13_LinkedList;

import static Class_13_LinkedList.mergeTwoSortedList.merge;

public class mergeSortforLL {
    public static void main(String[] args) {

    }
    public static Node mergeSort(Node head){
        if(head.next == null) return head;

        Node slow = head;
        Node fast = head;

        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        Node head2 = slow.next;
        slow.next = null;

        head = mergeSort(head);
        head2 = mergeSort(head2);

        return merge(head,head2);
    }


}
