package Class_06_Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class arraylistinjavabasic {
    public static void main(String[] args) {
        //Basic Syntax
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25); //25 --> Index = 0
        arr.add(7); //25 7
        arr.add(12); //25 7 12
        System.out.println(arr.get(2)); //12
        arr.set(1,100); //25 100 12
        System.out.println(arr.get(1)); // 100
        //System.out.println(arr);

        int n = arr.size(); //arr.length // n = 3
        System.out.println(n);

        arr.add(2); //25 100 12 2 //inserting the element in the last index
        arr.add(1,50); //25 50 100 12 2 //inserting the element in the req index and shifting the list rightwards

        n = arr.size(); // n = 5
        arr.remove(n-1); //removing the last element
        System.out.println(arr);

        //reversing manually
        int i=0, j= arr.size() - 1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }

        //Collections.reverse(arr);
        System.out.println(arr);
    }
}
