package Revision;

public class oddEvenIndex {
    public static void main(String[] args) {
        int[] arr = {-2,0,3,5,-5,10,14,15,4};
        for(int i=0; i<arr.length; i++){
            if(i%2==0) arr[i]+=10;
            else arr[i]*=2;
        }
        for(int ele:arr) System.out.print(ele+" ");
    }
}
