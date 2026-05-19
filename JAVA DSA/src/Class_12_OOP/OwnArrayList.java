package Class_12_OOP;

class Arraylist{ //user defined data structure
    int[] arr;
    int idx = 0;
    int size = 0;

    Arraylist(){}
    Arraylist(int capacity){
        arr = new int[capacity];
    }

    int capacity(){
        return arr.length;
    }

    void add(int ele){
        if(idx==capacity()) capacityIncrease();

        arr[idx++] = ele;
        size++;
    }

    void capacityIncrease(){
        int[] newArr = new int[capacity()*2];
        for(int i=0; i<arr.length; i++) newArr[i] = arr[i];
        arr = newArr;
    }

    void print(){
        for(int i=0; i<size; i++) System.out.print(arr[i]+" ");
    }
}

public class OwnArrayList {
    public static void main(String[] args) {
        Arraylist arr = new Arraylist(2);
        //System.out.println(arr.capacity());
        arr.add(15);
        arr.add(20);
        arr.add(25);
        arr.print();
    }
}
