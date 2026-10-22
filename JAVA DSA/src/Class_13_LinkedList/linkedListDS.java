package Class_13_LinkedList;

class Node{ //user defined data type
    int val;
    Node next; //by default null

    Node(){}
    Node(int val){
        this.val = val;
    }
}

class linkedList{ //user defined data structure
    Node head;
    Node tail;
    int size;
//if size = 5, means idx is 0 to 4,
    void display() {
        Node t = head;
        while(t!=null){
            System.out.print(t.val+" ");
            t = t.next;
        }
        System.out.println();
    }
    void addAtHead(int val) { //O(1)
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void addAtTail(int val){ //O(1)
        Node temp = new Node(val);
        if(head==null) head = tail = temp; //for no node
        else{ //multiple node //for one node, the same node is head and tail
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void deleteAtHead() { //O(1)
        if(head==null){
            System.out.println("LIST IS ALREADY EMPTY");
            return;
        }
        else if(head.next==null) head = tail = null;
        else head = head.next;
        size--;
    }
    void deleteAtTail(){
        Node temp = head;
        for(int i=0; i<size-2; i++){
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        size--;
    }
    void delete(int idx){
        //The main thing to remember is that in a singly linked list, removing a node means breaking the next link that points to it.
        if(idx==0) deleteAtHead();
        else if(idx==size-1) deleteAtTail();
        else{
            Node temp = head;
            for(int i=0; i<idx-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
//        Node temp = head;
//        for(int i=0; i<idx-1; i++){
//            temp = temp.next;
//        }
//        temp.next = temp.next.next; //When idx is the last index, temp.next is the last node, and temp.next.next is null.
//        // So this line sets temp.next = null, which cuts the last node off. Then tail = temp just fixes the tail pointer.
//        if(idx==size-1) tail = temp;
//        size--;
    }
    void getSize(){
        System.out.println(this.size);
    }
    int search(int val){
        if(head==null) return -1;
        int idx = 0;

        Node temp = head;
        while(temp!=null){
            if(temp.val==val) return idx;
            idx++;
            temp = temp.next;
        }

        return -1;
    }
    void insert(int idx, int val) {
        if(idx>size || idx<0){
            System.out.println("Index out of bound error");
            return;
        }

        Node temp = head;
        Node newNode = new Node(val);

        if(idx==0) addAtHead(val);
        else if(idx==size) addAtTail(val);
        else{
            for(int i=0; i<idx-1; i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }
    int get(int idx){
        Node temp = head;
        for(int i=0; i<idx; i++){
            temp = temp.next;
        }
        return temp.val;
    }
}

public class linkedListDS {
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.display();
        ll.insert(1,67);
        ll.display();
        ll.deleteAtTail();
        ll.display();
//        ll.getSize();
//        ll.delete(3);
//        ll.display();
//        ll.getSize();
    }
}
