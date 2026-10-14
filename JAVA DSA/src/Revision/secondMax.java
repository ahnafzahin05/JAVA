package Revision;

public class secondMax {
    public static void main(String[] args) {
        int[] arr = {4,10,10,6,3,11,11,8};
        int m1 = Integer.MIN_VALUE, m2 = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>m1) m1 = arr[i];
            if(arr[i]>m2 && arr[i]<m1) m2 = arr[i];
//            if(arr[i]>m2){
//                if(arr[i]>m1) m1 = arr[i];
//                else m2 = arr[i];
//            }
        }
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]>m1) m1 = arr[i];
//        }
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]>m2 && arr[i]<m1) m2 = arr[i];
//        }

        System.out.println(m1+" "+m2);
    }
}
