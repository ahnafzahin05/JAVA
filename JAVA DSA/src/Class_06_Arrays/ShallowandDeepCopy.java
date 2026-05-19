package Class_06_Arrays;

import java.util.Arrays;

public class ShallowandDeepCopy {
    public static void main(String[] args) {
        //Shallow Copy
//        int[] arr = {1,2,3,4};
//        int[] x = arr; //int[] x is referring to the array arr, any change in x also goes to arr i.e. main array got changed
//        x[0] = 10;        //pass by reference
//        System.out.println(arr[0]);

        //Deep Copy
        int[] arr = {1,2,3,4};
        int[] x = Arrays.copyOf(arr,arr.length); //brand new copy
        x[0] = 10; //original one doesn't change
        System.out.println(arr[0]);
        System.out.println(x[0]);

        //Deep copy
//        int[] arr = {1,2,3,4};
//        int[] x = new int[arr.length];
//        for(int i=0; i<arr.length; i++){
//            x[i] = arr[i];
//        }
//        x[0] = 100;
//        System.out.println(arr[0]);
    }
}
