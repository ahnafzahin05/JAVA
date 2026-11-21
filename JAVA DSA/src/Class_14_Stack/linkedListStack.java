package Class_14_Stack;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

class LLStack{
    Node head;
    int len;

    int peek(){
        if(head==null){
            System.out.println("StackUnderFlow");
            return -1;
        }
        return head.val;
    }

    int pop(){
        if(head==null){
            System.out.println("StackUnderFlow");
            return -1;
        }
        int x = head.val;
        head = head.next;
        len--;
        return x;
    }

    void push(int ele){
        Node temp = new Node(ele);

        if(len==0) head = temp;
        else{
            temp.next = head;
            head = temp;
        }
        len++;
    }

    int size(){
        return len;
    }

    void print(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }
}
public class linkedListStack {
    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.print();
        st.pop();
        st.print();
    }
}
