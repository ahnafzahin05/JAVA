package Class_13_LinkedList.Revision;

class Node{
    int val;
    Node next;

    Node(int val, Node next){
        this.val = val;
        this.next = next;
    }

    Node(int val){
        this(val,null);
    }
}

class linkedList{
    Node head;

    void print(){
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
    void append(int val){
        //add at last
        if(head==null) head = new Node(val);
        else{
            Node temp = head;
            while(temp.next!=null) temp = temp.next;
            temp.next = new Node(val);
        }
    }
    void prepend(int val){
        //add at first
        if(head==null) head = new Node(val);
        else{
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
        }
    }
    void deleteAtHead(){
        if(head==null) return;

        head = head.next;
    }
    void deleteAtTail(){
        if(head==null || head.next==null){
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next.next!=null) temp = temp.next;
        temp.next = null;
    }

    int search(int val){
        //returns index
        Node temp = head;
        int idx = 0;

        while(temp!=null){
            if(temp.val==val) return idx;
            temp = temp.next;
            idx++;
        }

        return -1;
    }
    void insert(int val, int index){
        Node newNode = new Node(val);
        Node dummy = new Node(-1);
        Node temp = dummy;
        temp.next = head;

        for(int i=0; i<index; i++) temp = temp.next;

        newNode.next = temp.next;
        temp.next = newNode;
        head = dummy.next;
    }
    void delete(int index){
        if(index<0) return;

        Node dummy = new Node(-1);
        Node temp = dummy;
        temp.next = head;

        for(int i=0; i<index; i++) temp = temp.next;
        temp.next = temp.next.next;
        head = dummy.next;
    }
}

class linkedListDS {
    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.append(10);
        list.append(20);
        list.prepend(30);
        list.delete(0);
        list.delete(-1);
        list.prepend(-10);
        list.deleteAtTail();
        list.insert(50,0);
        list.insert(60,1);
        System.out.println(list.search(-10));
        list.deleteAtHead();
        list.print();
    }
}
